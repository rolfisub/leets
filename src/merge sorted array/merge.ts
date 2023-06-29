export function merge(
  nums1: number[],
  m: number,
  nums2: number[],
  n: number
): void {
  let i = m;
  let i2 = 0;
  while (i <= m + n && i2 < n) {
    nums1[i] = nums2[i2];
    i++;
    i2++;
  }
  nums1.sort((a, b) => a - b);
}
