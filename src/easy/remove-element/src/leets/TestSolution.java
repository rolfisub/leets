package leets;

import java.util.Arrays;

public class TestSolution {
    public static void main(String[] args) {
        testSmallArray();
        testMediumArray();
        testLargeArray();
    }

    public static void testSmallArray() {
        System.out.println("testSmallArray");
        int[] input = {1,2,2,1};
        int val = 1;
        int[] expected = {2,2};
        Solution sln = new Solution();
        int l = sln.removeElement(input, val);

        if(l != expected.length) {
            System.out.println("Error, l = " + l + " expected:" + expected.length);
        }

        Arrays.sort(input, 0, expected.length - 1);
        for (int i = 0; i < expected.length; i++) {
            if(input[i] != expected[i]) {
                System.out.println("Error, input[" + i + "]: " + input[i] + " is not equal to expected[" + i + "]: " + expected[i]);
            }
        }
    }

    public static void testMediumArray() {
        System.out.println("testMediumArray");
        int[] input = {1,2,2,1,44,5,5,66,7,8,9,1};
        int val = 1;
        int[] expected = {2,2,5,5,7,8,9,44,66};
        Solution sln = new Solution();
        int l = sln.removeElement(input, val);

        if(l != expected.length) {
            System.out.println("Error, l = " + l + " expected:" + expected.length);
        }

        Arrays.sort(input, 0, expected.length - 1);
        for (int i = 0; i < expected.length; i++) {
            if(input[i] != expected[i]) {
                System.out.println("Error, input[" + i + "]: " + input[i] + " is not equal to expected[" + i + "]: " + expected[i]);
            }
        }
    }

    public static void testLargeArray() {
        System.out.println("testLargeArray");
        int[] input = {3,1,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1};
        int val = 2;
        int[] expected = {1,1,1,3};
        Solution sln = new Solution();
        int l = sln.removeElement(input, val);

        if(l != expected.length) {
            System.out.println("Error, l = " + l + " expected:" + expected.length);
        }

        Arrays.sort(input, 0, expected.length - 1);
        for (int i = 0; i < expected.length; i++) {
            if(input[i] != expected[i]) {
                System.out.println("Error, input[" + i + "]: " + input[i] + " is not equal to expected[" + i + "]: " + expected[i]);
            }
        }
    }
}