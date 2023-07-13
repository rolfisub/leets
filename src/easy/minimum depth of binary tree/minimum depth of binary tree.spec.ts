import {
  generateArrayWithRandomIntegers,
  generateBinaryTreeFromArray,
} from '../../common/utils';
import { minDepth } from './minimum depth of binary tree';
import { TreeNode } from '../../common/types';

describe('min depth of binary tree', () => {
  it('case 1', () => {
    const inputArray = [3, 9, 20, null, null, 15, 7];
    const inputNode = generateBinaryTreeFromArray(inputArray);
    const expected = 2;
    const result = minDepth(inputNode);
    expect(result).toEqual(expected);
  });
  it('case 2', () => {
    const inputArray = [2, null, 3, null, 4, null, 5, null, 6];
    const inputNode = generateBinaryTreeFromArray(inputArray);
    const expected = 5;
    const result = minDepth(inputNode);
    expect(result).toEqual(expected);
  });
  it('case 3', () => {
    const inputArray: Array<number | null> = [];
    const inputNode = generateBinaryTreeFromArray(inputArray);
    const expected = 0;
    const result = minDepth(inputNode);
    expect(result).toEqual(expected);
  });
  it('case 4', () => {
    const inputArray: Array<number | null> = generateArrayWithRandomIntegers(
      3001,
      -100,
      100
    );
    const inputNode = generateBinaryTreeFromArray(inputArray);
    const expected = 11;
    const result = minDepth(inputNode);
    expect(result).toEqual(expected);
  });
});
