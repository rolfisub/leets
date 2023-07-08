import { middleNode } from './middle of the linked list';
import { ListNode } from '../../common/types';

describe('middle of the linked list', () => {
  it('case 1', () => {
    const d5 = new ListNode(5, null);
    const d4 = new ListNode(4, d5);
    const d3 = new ListNode(3, d4);
    const d2 = new ListNode(2, d3);
    const d1 = new ListNode(1, d2);

    const expectedResult = d3;
    const result = middleNode(d1);
    expect(result).toEqual(expectedResult);
  });
  it('case 2', () => {
    const d6 = new ListNode(6, null);
    const d5 = new ListNode(5, d6);
    const d4 = new ListNode(4, d5);
    const d3 = new ListNode(3, d4);
    const d2 = new ListNode(2, d3);
    const d1 = new ListNode(1, d2);

    const expectedResult = d4;
    const result = middleNode(d1);
    expect(result).toEqual(expectedResult);
  });
});
