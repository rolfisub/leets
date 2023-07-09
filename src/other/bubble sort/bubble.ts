/**
 * Bubble sort implementation
 */
import { ResultSteps } from '../../common/types';

export function bubbleSort(data: Array<number>): ResultSteps<Array<number>> {
  let swapCount = 1;
  let steps = 0;
  while (swapCount > 0) {
    swapCount = 0;
    for (let i = 0; i < data.length; i++) {
      const n1 = data[i];
      const n2 = data[i + 1];
      if (n1 > n2) {
        data[i] = n2;
        data[i + 1] = n1;
        swapCount++;
      }
      steps++;
    }
  }
  return {
    result: data,
    steps,
  };
}
