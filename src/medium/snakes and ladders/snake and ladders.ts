interface Position {
  x: number;
  y: number;
}

interface Move {
  old: Position;
  new: Position;
  steps: number;
  xDir?: number;
  yDir?: number;
}

export function snakesAndLadders(board: number[][]): number {
  // what is the bottom left?
  const size = board.length;
  const bottomLeft = {
    x: size - 1,
    y: 0,
  };
  // how to iterate on a boustrophedon way
  let xDirection = -1;
  let yDirection = (row: number): number => {
    // alternates between +1 and -1 depending on the row
    let dir = -1;
    for (let i = size - 1; i >= 0; i--) {
      // toggle direction
      if (dir === -1) {
        dir = 1;
      } else if (dir === 1) {
        dir = -1;
      }
      if (row === i) return dir;
    }
    throw 'row not found';
  };

  // creates a move object
  function createMove(curr: Position, steps: number): Move {
    function calculateNewPosition(): Position {
      let currX = curr.x;
      let currY = curr.y;
      for (let s = 0; s < steps; s++) {
        let yDir = yDirection(currX);
        // are we on the last square of the row?
        let isLastSquare: boolean = false;
        let isLeftBoundary: boolean = false;
        // if yes we need to flip directions by moving one row up and then moving to the
        if (yDir === 1 && currY === board.length - 1) {
          isLastSquare = true;
        } else if (yDir == -1 && currY === 0) {
          isLastSquare = true;
          isLeftBoundary = true;
        }

        if (isLastSquare) {
          // move up
          currX += xDirection;
          // move y
          currY = isLeftBoundary ? 0 : board.length - 1;
        } else {
          currY += yDir;
        }
      }

      if (currX < 0) {
        currX = 0;
      }

      return {
        x: currX,
        y: currY,
      };
    }
    return {
      old: curr,
      new: calculateNewPosition(),
      steps,
    };
  }
  // get max dice value for a current position
  function getMaxDiceMove({ x, y }: Position): Move | null {
    const max = 6;
    for (let i = max; i > 0; i--) {
      const move = createMove({ x, y }, i);
      if (board[move.new.x][move.new.y] === -1) {
        return move;
      }
    }
    return null;
  }

  // get all ladder and snake moves from a certain position
  function getSnakeMoves(curr: Position): Move[] {
    const result: Move[] = [];
    const maxDiceVal = 6;
    for (let i = 1; i <= maxDiceVal; i++) {
      result.push(createMove(curr, i));
    }
    return result.filter((move, index, arr) => {
      const val = board[move.new.x][move.new.y];
      return val !== -1;
    });
  }

  // amount or moves needs to be between 1 and 6 or less if boars is smaller
  function getAllAvailableMoves(curr: Position): Move[] {
    /**
     * Possible Paths:
     * - get max dice available value (no ladder = -1)
     * - any ladders before dice max (6) for each ladder we have a new path
     *
     */

    const allMoves: Move[] = [];

    const maxDiceVal = getMaxDiceMove(curr);
    if (maxDiceVal) {
      allMoves.push(maxDiceVal);
    }

    const snakeMoves: Move[] = getSnakeMoves(curr);
    snakeMoves.forEach((m) => {
      allMoves.push(m);
    });

    return allMoves;
  }

  // we cannot brute force it, the algorithm needs to find the quickest way to win,
  // with the optimal options all taken in consideration

  // if value in board is not -1, we have a snake or a ladder, the value is the
  // square on which you must move if you land on it
  // return the least amount of moves needed to beat the game
  return 0;
}
