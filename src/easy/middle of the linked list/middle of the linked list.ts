import { ListNode } from '../../common/types';

export function middleNode(head: ListNode | null): ListNode | null {
  const allNodes = [];
  let currentNode = head;
  while (currentNode) {
    allNodes.push(currentNode);
    currentNode = currentNode.next;
  }

  if (allNodes.length === 1) return allNodes[0];
  if (allNodes.length === 2) return allNodes[1];
  if (!(allNodes.length % 2)) {
    return allNodes[allNodes.length / 2];
  } else {
    return allNodes[Math.floor(allNodes.length / 2)];
  }
}
