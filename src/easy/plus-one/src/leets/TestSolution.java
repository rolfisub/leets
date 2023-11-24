package leets;

import java.util.Arrays;

public class TestSolution {
    public static void log(String str) {
        System.out.println(str);
    }

    public static String getArrayString(int[] values) {
        StringBuilder strB = new StringBuilder();
        for(int n:values) {
            strB.append(String.valueOf(n));
        }
        return strB.toString();
    }
    public static void main(String[] args) {
        testBasicInput();
        testLargeArray();
        test9SingleItem();
        test9MultipleItem();
        testMultipleChained9();
    }

    /**
     * test that basic input array
     * test large array
     * test 9 single item
     * test 9 multiple item
     * test multiple chained 9
     */

     public static void testBasicInput() {
        log("-testBasicInput-");
        Solution sln = new Solution();
        int[] input = {1,2,3};
        int[] expected = {1,2,4};
        int[] result = sln.plusOne(input);

        log("input: " + getArrayString(input));
        log("expected: " + getArrayString(expected));
        log("result: " + getArrayString(result));

        if(!Arrays.equals(expected, result)) {
            // error
            log("Error");
        }
     }

     
     public static void testLargeArray() {
        log("-testLargeArray-");
        Solution sln = new Solution();
        int[] input = {1,2,3,4,5,6,6,6,6,7};
        int[] expected = {1,2,3,4,5,6,6,6,6,8};
        int[] result = sln.plusOne(input);

        log("input: " + getArrayString(input));
        log("expected: " + getArrayString(expected));
        log("result: " + getArrayString(result));

        if(!Arrays.equals(expected, result)) {
            // error
            log("Error");
        }
     }

     public static void test9SingleItem() {
        log("-test9SingleItem-");
        Solution sln = new Solution();
        int[] input = {9};
        int[] expected = {1,0};
        int[] result = sln.plusOne(input);

        log("input: " + getArrayString(input));
        log("expected: " + getArrayString(expected));
        log("result: " + getArrayString(result));

        if(!Arrays.equals(expected, result)) {
            // error
            log("Error");
        }
     }

     public static void test9MultipleItem() {
        log("-test9MultipleItem-");
        Solution sln = new Solution();
        int[] input = {2,9};
        int[] expected = {3,0};
        int[] result = sln.plusOne(input);

        log("input: " + getArrayString(input));
        log("expected: " + getArrayString(expected));
        log("result: " + getArrayString(result));

        if(!Arrays.equals(expected, result)) {
            // error
            log("Error");
        }
     }

     public static void testMultipleChained9() {
        log("-testMultipleChained9-");
        Solution sln = new Solution();
        int[] input = {1,3,4,9,9,9};
        int[] expected = {1,3,5,0,0,0};
        int[] result = sln.plusOne(input);

        log("input: " + getArrayString(input));
        log("expected: " + getArrayString(expected));
        log("result: " + getArrayString(result));

        if(!Arrays.equals(expected, result)) {
            // error
            log("Error");
        }
     }
}
