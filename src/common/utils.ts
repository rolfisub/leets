export function getRandomInteger(min: number, max: number): number {
  // Calculate the range of numbers
  const range = max - min + 1;

  // Generate a random number within the range
  return parseInt(`${Math.floor(Math.random() * range) + min}`, 10);
}
