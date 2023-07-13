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

/**
 * Expects an array fo the following shape:
 * const example = [
 *      0, // 1 - 1
 *      1,2, // 2 - 2
 *      3,4,5,6, // 3 - 4
 *      7,8,9,10,7,8,9,10, // 4 - 8
 *      7,8,9,10,7,8,9,10,7,8,9,10,7,8,9,10, // 5 - 16
 *      7,8,9,10,7,8,9,10,7,8,9,10,7,8,9,10, 7,8,9,10,7,8,9,10,7,8,9,10,7,8,9,10, // 6 - 32
 * ];
 * @param queue
 */
export function generateBinaryTreeFromArray(
  queue: Array<number | null>
): TreeNode | null {
  if (!queue.length) return null;
  if (queue.length > 1) {
    const isEven = (queue.length - 1) % 2 === 0;
    if (!isEven) {
      throw Error(
        'array provided is does not contain an even amount of numbers'
      );
    }
  }
  function processNode(parentNodes: Array<TreeNode | null>): TreeNode | null {
    if (!parentNodes.length) return null;
    const newParentNodes = [];
    for (const node of parentNodes) {
      if (node) {
        if (queue.length > 0) {
          const valLeft = queue.shift();
          node.left = valLeft === null ? null : new TreeNode(valLeft);
          newParentNodes.push(node.left);
        }
        if (queue.length > 0) {
          const valRight = queue.shift();
          node.right = valRight === null ? null : new TreeNode(valRight);
          newParentNodes.push(node.right);
        }
      }
    }
    processNode(newParentNodes);
    return parentNodes[0];
  }

  return processNode([new TreeNode(queue.shift() as number)]);
}
