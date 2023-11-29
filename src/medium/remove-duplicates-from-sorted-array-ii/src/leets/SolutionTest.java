package leets;

import utils.Logger;

class SolutionTest {
    public static void main(String[] args) {
        testSmall();
        testMedium();
    }

    public static void log(String str) {
        Logger.log(str);
    }

    public static void testSmall() {
        log("testSmall");
        Solution sln = new Solution();
        int[] input = {1,1,1,2,2,2};
        int[] expected = {1,1,2,2};
        int expectedLength = expected.length;

        int resultLenght = sln.removeDuplicates(input);
        if (expectedLength != resultLenght) {
            log("Error: expected length = " + expectedLength + " got = " + resultLenght);
        }
        for(int i = 0; i < expectedLength; i++) {
           if(input[i] != expected[i]) {
              log("Error: index = " + i + " input = " + input[i] + " does not equal expected = " + expected[i]);
           } 
        }
    }

    public static void testMedium() {
        log("testMedium");
        Solution sln = new Solution();
        int[] input = {0,0,1,1,1,1,2,3,3};
        int[] expected = {0,0,1,1,2,3,3};
        int expectedLength = expected.length;

        int resultLenght = sln.removeDuplicates(input);
        if (expectedLength != resultLenght) {
            log("Error: expected length = " + expectedLength + " got = " + resultLenght);
        }
        for(int i = 0; i < expectedLength; i++) {
           if(input[i] != expected[i]) {
            log("Error: index = " + i + " input = " + input[i] + " does not equal expected = " + expected[i]);
           } 
        }
        
    }
}
