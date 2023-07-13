import { ListNode, TreeNode } from './types';

export function getRandomInteger(min: number, max: number): number {
  // Calculate the range of numbers
  const range = max - min + 1;

  // Generate a random number within the range
  return parseInt(`${Math.floor(Math.random() * range) + min}`, 10);
}

export function generateLinkedListFromArray(array: number[]): ListNode | null {
  if (array.length === 0) return null;

  const result: ListNode[] = [];

  array.forEach((item) => {
    result.push(new ListNode(item));
  });

  result.forEach((value, index, array) => {
    if (array[index + 1]) value.next = array[index + 1];
  });

  return result[0];
}

export function generateArrayWithRandomIntegers(
  size: number,
  min: number,
  max: number,
  sorted: boolean = false
): number[] {
  const result: number[] = [];
  for (let c = 0; c < size; c++) {
    result.push(getRandomInteger(min, max));
  }
  if (sorted) {
    result.sort((a, b) => a - b);
  }
  return result;
}

export function generateBinaryTreeFromArray(
  array: Array<number | null>
): TreeNode | null {
  return null;
}
