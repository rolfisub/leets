import {
  generateArrayWithRandomIntegers,
  generateLinkedListFromArray,
} from '../../common/utils';
import { mergeTwoLists } from './merge two sorted lists';

describe('merge two sorted lists', () => {
  it('case 1', () => {
    const input1 = generateLinkedListFromArray([1, 2, 4]);
    const input2 = generateLinkedListFromArray([1, 3, 4]);
    const result = mergeTwoLists(input1, input2);
    const expected = generateLinkedListFromArray([1, 1, 2, 3, 4, 4]);
    expect(result).toEqual(expected);
  });
  it('case 2', () => {
    const input1 = generateLinkedListFromArray([]);
    const input2 = generateLinkedListFromArray([]);
    const result = mergeTwoLists(input1, input2);
    const expected = generateLinkedListFromArray([]);
    expect(result).toEqual(expected);
  });
  it('case 3', () => {
    const input1 = generateLinkedListFromArray([]);
    const input2 = generateLinkedListFromArray([0]);
    const result = mergeTwoLists(input1, input2);
    const expected = generateLinkedListFromArray([0]);
    expect(result).toEqual(expected);
  });
  it('case 4', () => {
    const array1 = generateArrayWithRandomIntegers(10, 0, 100, true);
    const input1 = generateLinkedListFromArray(array1);
    const array2 = generateArrayWithRandomIntegers(10, 0, 100, true);
    const input2 = generateLinkedListFromArray(array2);
    const resultArray = array1.concat(...array2).sort((a, b) => a - b);
    const expected = generateLinkedListFromArray(resultArray);
    const result = mergeTwoLists(input1, input2);
    expect(result).toEqual(expected);
  });
});
