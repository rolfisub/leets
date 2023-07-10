export function twoSum(nums: number[], target: number): number[] {
  const result = [];
  for (let i = 0; i < nums.length; i++) {
    for (let j = 0; j < nums.length; j++) {
      if (i !== j) {
        const val1 = nums[i];
        const val2 = nums[j];
        if (val1 + val2 === target) {
          result.push(i);
          result.push(j);
          return result;
        }
      }
    }
  }
  throw 'Error solution not found';
}
