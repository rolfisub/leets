export function isPalindrome(x: number): boolean {
  let numStr = x.toString();

  let i = 0;
  let j = numStr.length - 1;

  while (i < numStr.length && j >= 0) {
    if (numStr[i] !== numStr[j]) {
      return false;
    }
    i++;
    j--;
  }

  return true;
}
