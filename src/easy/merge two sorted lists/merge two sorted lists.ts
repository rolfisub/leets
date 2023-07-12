import { ListNode } from '../../common/types';

export function mergeTwoLists(
  list1: ListNode | null,
  list2: ListNode | null
): ListNode | null {
  const result: Array<ListNode> = [];

  function processList(item1: ListNode | null, item2: ListNode | null): void {
    if (item1 && item2) {
      if (item1.val < item2.val) {
        result.push(item1);
        if (!item1.next) return;
        processList(item1.next, item2);
      } else if (item2.val < item1.val) {
        result.push(item2);
        if (!item2.next) return;
        processList(item1, item2.next);
      } else {
        result.push(item1);
        result.push(item2);
        if (!item1.next) return;
        if (!item2.next) return;
        processList(item1.next, item2.next);
      }
    } else {
      if (!item1 && item2) {
        result.push(item2);
        if (!item2.next) return;
        processList(item1, item2.next);
      } else if (!item2 && item1) {
        result.push(item1);
        if (!item1.next) return;
        processList(item1.next, item2);
      } else {
        return;
      }
    }
  }

  if (list1 || list2) {
    processList(list1, list2);
  } else {
    return null;
  }

  result.forEach((item, index, array) => {
    if (array[index + 1]) {
      item.next = array[index + 1];
    }
    if (index === array.length - 1) {
      item.next = null;
    }
  });

  if (result.length > 0) {
    return result[0];
  }

  return null;
}
