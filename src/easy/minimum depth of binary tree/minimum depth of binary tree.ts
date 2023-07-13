/**
 * Definition for a binary tree node.
 *
 */
import { TreeNode } from '../../common/types';

export function minDepth(root: TreeNode | null): number {
  if (!root) return 0;
  let currentMinLevel: number = 9999999999999999;
  function processNode(node: TreeNode | null, level = 1): void {
    if (!node) return;
    const isLeave = !node.left && !node.right;
    if (isLeave) {
      if (currentMinLevel > level) {
        currentMinLevel = level;
      }
    } else {
      if (level + 1 < currentMinLevel) {
        processNode(node.left, level + 1);
        processNode(node.right, level + 1);
      }
    }
  }
  processNode(root);

  return currentMinLevel;
}
