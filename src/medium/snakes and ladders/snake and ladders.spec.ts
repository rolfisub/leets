import { snakesAndLadders } from './snake and ladders';

describe('snake and ladders', () => {
  it('case 1', () => {
    const input = [
      [-1, -1, -1, -1, -1, -1],
      [-1, -1, -1, -1, -1, -1],
      [-1, -1, -1, -1, -1, -1],
      [-1, 35, -1, -1, 13, -1],
      [-1, -1, -1, -1, -1, -1],
      [-1, 15, -1, -1, -1, -1],
    ];
    const expected = 4;
    const result = snakesAndLadders(input);
    expect(result).toEqual(expected);
  });
  it('case 2', () => {
    const input = [
      [-1, -1],
      [-1, 3],
    ];
    const expected = 1;
    const result = snakesAndLadders(input);
    expect(result).toEqual(expected);
  });
});
