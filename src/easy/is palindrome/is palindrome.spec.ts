import { isPalindrome } from './is palindrome';

describe('is palindrome', () => {
  it('case 1', () => {
    const input = 121;
    const expected = true;
    const result = isPalindrome(input);
    expect(result).toEqual(expected);
  });
  it('case 2', () => {
    const input = 1221;
    const expected = true;
    const result = isPalindrome(input);
    expect(result).toEqual(expected);
  });
  it('case 3', () => {
    const input = 1231;
    const expected = false;
    const result = isPalindrome(input);
    expect(result).toEqual(expected);
  });
  it('case 4', () => {
    const input = 12321;
    const expected = true;
    const result = isPalindrome(input);
    expect(result).toEqual(expected);
  });
});
