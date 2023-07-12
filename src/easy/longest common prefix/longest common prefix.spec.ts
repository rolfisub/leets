import { longestCommonPrefix } from './longest common prefix';

describe('longest common prefix', () => {
  it('Case 1', () => {
    const input = ['flower', 'flow', 'flight'];
    const expected = 'fl';
    const result = longestCommonPrefix(input);
    expect(result).toEqual(expected);
  });
  it('Case 2', () => {
    const input = ['dog', 'racecar', 'car'];
    const expected = '';
    const result = longestCommonPrefix(input);
    expect(result).toEqual(expected);
  });
});
