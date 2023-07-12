export function longestCommonPrefix(strs: string[]): string {
  let i = 0;
  let done = false;
  let commonPrefix = '';
  while (!done) {
    const charSet = new Set();
    strs.forEach((str) => charSet.add(str[i]));
    if (charSet.size === 1) {
      for (const char of charSet.values()) {
        if (char === undefined) {
          done = true;
          break;
        }
        commonPrefix += char;
      }
    } else {
      done = true;
    }
    i++;
  }
  return commonPrefix;
}
