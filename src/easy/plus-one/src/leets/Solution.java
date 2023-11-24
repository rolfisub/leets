package leets;

public final class Solution {

    public static void main(String[] args) {
        TestSolution.main(args);
    }

    public int[] plusOne(int[] digits) {
        if(digits.length == 1) {
            if (digits[0] == 9) {
                int[] result = {1,0};
                return result;
            } else {
                int[] result = {++digits[0]};
                return result;
            }
        }

        int lastDigitIndex = digits.length - 1;
        int[] result = addOneTo(digits, lastDigitIndex);
        return result;   
    }

    private int[] addOneTo(int[] digits, int indextTo) {
        int digit = digits[indextTo];
        if(digit == 9) {
            digits[indextTo] = 0;
            int nextIndex = --indextTo;
            if (nextIndex < 0) {
                int[] newDigits  = new int[digits.length + 1];
                int index = 0;
                newDigits[index] = 1;
                for(int d:digits) {
                    index++;
                    newDigits[index] = d;
                }
                return newDigits;
            } else {
                return addOneTo(digits, nextIndex);
            }
        } else {
            digits[indextTo]++;
        }
        return digits;
    }
}