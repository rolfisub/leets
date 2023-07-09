import { bubbleSort } from './bubble';
import { getRandomInteger } from '../../common/utils';

describe('bubble sort', () => {
  it('sorts correctly', () => {
    const input = [5, 4, 3, 2, 1];
    const result = bubbleSort(input);
    expect(result).toEqual({ result: [1, 2, 3, 4, 5], steps: 25 });
  });
  it('test medium data set', () => {
    const size = 500;
    const input = [];
    for (let i = 0; i < size; i++) {
      input.push(size - i);
    }
    const result = bubbleSort(input);
    expect(result).toEqual({ result: input.reverse(), steps: 250000 });
  });
  it('test large data set', () => {
    const size = 5000;
    const input = [];
    for (let i = 0; i < size; i++) {
      input.push(size - i);
    }
    const result = bubbleSort(input);
    expect(result).toEqual({ result: input.reverse(), steps: 25000000 });
  });
  it('random range data set', () => {
    const size = getRandomInteger(0, 10000);
    const input = [];
    for (let i = 0; i < size; i++) {
      input.push(getRandomInteger(0, 10000));
    }
    const result = bubbleSort(input);
    expect(result.result.length).toEqual(size);
    expect(result.steps).toBeGreaterThan((size * size) / 2);
  });
});
