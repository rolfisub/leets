import { Data, shortestPath } from './shortest';

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
 *                |           --------------8---------------            |
 *                ------------------------15------------------------------
 *
 *
 *
 */

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
  ['K', 'M', 6],
  ['T', 'J', 15],
  ['T', 'M', 2],
  ['F', 'T', 2],
  ['D', 'H', 1],
];

describe('shortest path', () => {
  it('nearest path', () => {
    const path = shortestPath(exampleData, 'A', 'B');
    expect(path).toEqual('A->B');
  });
  it('medium path', () => {
    const path = shortestPath(exampleData, 'A', 'T');
    expect(path).toEqual('A->B->C->F->T');
  });
  it('large path', () => {
    const path = shortestPath(exampleData, 'A', 'M');
    expect(path).toEqual('A->D->H->K->M');
  });
  it('random start', () => {
    const path = shortestPath(exampleData, 'F', 'J');
    expect(path).toEqual('F->C->B->A->D->H->J');
  });
  it('left side short', () => {
    const path = shortestPath(exampleData, 'F', 'C');
    expect(path).toEqual('F->C');
  });
});
