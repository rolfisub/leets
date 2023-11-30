package leets;

public class SolutionTest {
    public static void main(String[] args) {
        testSmall();
        testMedium();
    }

    static void testSmall() {
        log("testSmall");
        Solution solution = new Solution();
        int[] input = {3,2,3};
        int expected = 3;
        int result = solution.majorityElement(input);

        if(expected != result) {
            log("Error: expected = " + expected + " result = " + result);
        }
    }

    static void log(String str) {
        System.out.println(str);
    }

    static void testMedium() {
        log("testMedium");
        Solution solution = new Solution();
        int[] input = {3,3,2,2,2,3,3,2,2};
        int expected = 2;
        int result = solution.majorityElement(input);

        if(expected != result) {
            log("Error: expected = " + expected + " result = " + result);
        }
    }

    
}
