package leets;

public class SolutionTest {
    public static void main(String[] args) {
        testSmall();
        testMedium();
        testLarge();
    }

    static void log(String str) {
        System.out.println(str);
    }

    static void testSmall() {
        log("testSmall");
        Solution solution = new Solution();
        int[] input = {1,2,3};
        int steps = 1;
        int[] expected = {3,1,2};
        
        solution.rotate(input, steps);

        for (int i = 0; i < input.length; i++) {
            if(input[i] != expected[i]) {
                log("Error: index = " + i + " input[i] = " + input[i] + " expected[i] = " + expected[i]);
            }
        }
    }

    static void testMedium() {
        log("testMedium");
        Solution solution = new Solution();
        int[] input = {1,2,3,4,5,6,7,8};
        int steps = 4;
        int[] expected = {5,6,7,8,1,2,3,4};
        
        solution.rotate(input, steps);

        for (int i = 0; i < input.length; i++) {
            if(input[i] != expected[i]) {
                log("Error: index = " + i + " input[i] = " + input[i] + " expected[i] = " + expected[i]);
            }
        }
    }

    static void testLarge() {
        log("testLarge");
        Solution solution = new Solution();
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        int steps = 10000;
        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        
        solution.rotate(input, steps);

        for (int i = 0; i < input.length; i++) {
            if(input[i] != expected[i]) {
                log("Error: index = " + i + " input[i] = " + input[i] + " expected[i] = " + expected[i]);
            }
        }
    }
}
