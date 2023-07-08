/**
 * Find the shortest path between any two nodes and return the directions on the following
 * format:
 * A->B->C->D
 *                                    ---------7-----------
 *                                   |                     |
 *                      A -----3---- B ---3--- C -----3---- F
 *                      | 1          |                       | 2
 *              E--2----D            | 2                     |
 *              |       | 1          Z ----3---- G ----3---- T ----------
 *              | 3     H -----3-----|           |           |           |
 *              |       |                        |           | 2         |
 *              - J-----3-----K----------8-------            M           |
 *                |           |                              |           |
 *                |           --------------6---------------            |
 *                ------------------------15------------------------------
 *
 *
 *
 */

type Path = Array<string | number>;
export type Data = Path[];

interface PathResult {
  path: Path;
  distance: number;
}

export function shortestPath(data: Data, from: string, to: string): string {
  // given a node, get all connections
  function getNodePaths(node: string): Path[] {
    return (
      data
        .filter((conn) => {
          // this supports bidirectional requests
          return conn[0] === node || conn[1] === node;
        })
        // normalize output
        .map((path) => {
          if (path[0] === node) {
            return path;
          } else {
            // reverse the position
            return [path[1], path[0], path[2]];
          }
        })
    );
  }

  function getDistanceBetweenTwoNodes(
    node1: string | number,
    node2: string | number
  ): number {
    for (const conn of data) {
      if (
        (conn[0] === node1 || conn[1] === node1) &&
        (conn[0] === node2 || conn[1] === node2)
      ) {
        return conn[2] as number;
      }
    }
    throw `Distance not found between ${node1} and ${node2}`;
  }

  function getTotalDistance(path: Array<string | number>): number {
    let distance = 0;
    for (let i = 0; i < path.length; i++) {
      const node1 = path[i];
      const node2 = path[i + 1] ?? null;
      if (!node2) {
        return distance;
      }
      distance += getDistanceBetweenTwoNodes(node1, node2) ?? 0;
    }
    return distance;
  }

  const paths: Array<PathResult> = [];
  function traverseAllPaths(
    node: string,
    to: string,
    visitedNodes: Array<string | number> = []
  ): void {
    if (!visitedNodes.includes(node)) visitedNodes.push(node);

    const nodePaths = getNodePaths(node);
    for (let i = 0; i < nodePaths.length; i++) {
      const newNode = nodePaths[i][1] as string;
      if (!visitedNodes.includes(newNode)) {
        const newVisited = [...visitedNodes];
        newVisited.push(newNode);
        const totalDistance = getTotalDistance(newVisited);
        const pathResult = {
          path: newVisited,
          distance: totalDistance,
        };
        if (newVisited.length > 1) {
          paths.push(pathResult);
        }
        if (node !== to) {
          traverseAllPaths(newNode, to, newVisited);
        }
      }
    }
    return;
  }

  traverseAllPaths(from, to);

  // filter all the valid paths
  const validPaths = paths.filter((path, index, array) => {
    const lastIndex = path.path.length - 1;
    return path.path[lastIndex] === to;
  });

  // get the shortest distance path
  const orderedPaths = validPaths.sort((a, b) => {
    return a.distance - b.distance;
  });

  const fastestPath = orderedPaths[0];
  // form the result
  let result: string = '';
  fastestPath.path.forEach((node, i) => {
    result += `${node}`;
    if (i < fastestPath.path.length - 1) {
      result += '->';
    }
  });

  return result;
}
