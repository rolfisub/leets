import { twoSum } from './two sum';

describe('two sum', () => {
  it('case 1', () => {
    const input: number[] = [2, 7, 11, 15];
    const target = 9;
    const expected = [0, 1];
    const result = twoSum(input, target);
    expect(result).toEqual(expected);
  });
  it('case 2', () => {
    const input: number[] = [3, 2, 4];
    const target = 6;
    const expected = [1, 2];
    const result = twoSum(input, target);
    expect(result).toEqual(expected);
  });
  it('case 3', () => {
    const input: number[] = [3, 3];
    const target = 6;
    const expected = [0, 1];
    const result = twoSum(input, target);
    expect(result).toEqual(expected);
  });
});
