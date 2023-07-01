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
 *                |           --------------10---------------            |
 *                ------------------------15------------------------------
 *
 *
 *
 */

type Path = Array<string | number>;
type Data = Path[];

// an array of node connections with a distance value
export const exampleData: Data = [
  ['A', 'B', 3],
  ['B', 'C', 3],
  ['C', 'F', 3],
  ['B', 'F', 7],
  ['B', 'Z', 2],
  ['Z', 'G', 3],
  ['G', 'T', 3],
  ['Z', 'H', 3],
  ['A', 'D', 1],
  ['D', 'E', 2],
  ['E', 'J', 3],
  ['H', 'J', 3],
  ['H', 'K', 3],
  ['K', 'G', 8],
  ['K', 'M', 2],
  ['T', 'J', 15],
  ['T', 'M', 2],
  ['F', 'T', 2],
  ['D', 'H', 1],
];

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

  function traverseAllPaths(
    node: string,
    to: string,
    visitedNodes: string[] = [],
    result: Array<Array<Path[]>> = [],
    currentPath: number = 0
  ): Array<Array<Path[]>> {
    if (node === to) {
      return;
    }
    visitedNodes.push(node);
    console.log(node);
    const nodePaths = getNodePaths(node);
    console.log(nodePaths);
    for (let i = 0; i < nodePaths.length; i++) {
      const newNode = nodePaths[i][1] as string;
      console.log('newNode', newNode);
      console.log('visitedNodes', visitedNodes);
      if (!visitedNodes.includes(newNode)) {
        traverseAllPaths(newNode, to, visitedNodes, result, i);
      }
    }
  }

  traverseAllPaths(from, to);

  return '';
}
