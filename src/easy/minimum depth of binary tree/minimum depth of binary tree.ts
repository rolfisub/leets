/**
 * Definition for a binary tree node.
 *
 */
import { TreeNode } from '../../common/types';

export function minDepth(root: TreeNode | null): number {
  if (!root) return 0;
  const leavesLevels: number[] = [];
  function processNode(node: TreeNode | null, level = 1): void {
    if (!node) return;
    const isLeave = !node.left && !node.right;
    if (isLeave) {
      leavesLevels.push(level);
    } else {
      processNode(node.left, level + 1);
      processNode(node.right, level + 1);
    }
  }
  processNode(root);

  return leavesLevels.sort((a, b) => a - b)[0];
}
