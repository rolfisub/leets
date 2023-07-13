import { ListNode } from '../../common/types';

export function mergeTwoLists(
  list1: ListNode | null,
  list2: ListNode | null
): ListNode | null {
  if (!list1 && !list2) return null;

  const outputArray: Array<ListNode> = [];

  function processList(item1: ListNode | null, item2: ListNode | null): void {
    if (item1 && item2) {
      if (item1.val < item2.val) {
        outputArray.push(item1);
        processList(item1.next, item2);
      } else if (item2.val < item1.val) {
        outputArray.push(item2);
        processList(item1, item2.next);
      } else {
        outputArray.push(item1);
        outputArray.push(item2);
        processList(item1.next, item2.next);
      }
    } else {
      if (!item1 && item2) {
        outputArray.push(item2);
        processList(item1, item2.next);
      } else if (!item2 && item1) {
        outputArray.push(item1);
        processList(item1.next, item2);
      }
    }
  }

  processList(list1, list2);

  function relinkArrayOfItems(array: ListNode[]): ListNode | null {
    if (!array.length) return null;

    array.forEach((item, index) => {
      if (array[index + 1]) {
        item.next = array[index + 1];
      }
      if (index === array.length - 1) {
        item.next = null;
      }
    });

    return array[0];
  }

  return relinkArrayOfItems(outputArray);
}
