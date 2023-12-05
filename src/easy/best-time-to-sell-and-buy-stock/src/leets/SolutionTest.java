package leets;

public class SolutionTest {
    public static void main(String[] args) {
        testSmall();
        testMedium();
    }

    static void log(String str) {
        System.out.println(str);
    }

    static void testSmall() {
        log("testSmall");
        Solution sln = new Solution();
        int[] input = {7,1,2,3,4,5,6};
        int result = sln.maxProfit(input);
        int expected = 5;
        if(result != expected) {
            log("Error: result = " + result + " expected = " + expected);
        }
    }

    static void testMedium() {
        log("testMedium");
        Solution sln = new Solution();
        int[] input = {7,4,5,6,1,6,4,9};
        int result = sln.maxProfit(input);
        int expected = 8;
        if(result != expected) {
            log("Error: result = " + result + " expected = " + expected);
        }
    }
}
