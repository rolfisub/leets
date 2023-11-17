import leets.Solution;

public class App {

    public static void log(String str) {
        System.out.println(str);
    }

    
    public static void testSmall() throws Exception {
        log("testSmall input: " + 2);
        int small = 2;
        int expected = 2;
        int result = Solution.climbStairs(small);
        log("expected = " + expected);
        log("result = " + result);

        if(expected != result) {
            throw new Exception("oops");
        }
    }

    
    public static void testMedium() throws Exception {
        log("testMedium input: " + 3);
        int small = 3;
        int expected = 3;
        int result = Solution.climbStairs(small);
        log("expected = " + expected);
        log("result = " + result);

        if(expected != result) {
            throw new Exception("oops");
        }
    }

    public static void testLarge() throws Exception {
        log("testMedium input: " + 6);
        int small = 6;
        int expected = 13;
        int result = Solution.climbStairs(small);
        log("expected = " + expected);
        log("result = " + result);

        if(expected != result) {
            throw new Exception("oops");
        }
    }

    public static void testVeryLarge() throws Exception {
        log("testMedium input: " + 6);
        int small = 35;
        int expected = 13;
        int result = Solution.climbStairs(small);
        log("expected = " + expected);
        log("result = " + result);

        if(expected != result) {
            throw new Exception("oops");
        }
    }

    public static void testSuperLargeThowsException() throws Exception {
        try {
            log("testMedium input: " + 400);
            int small = 400;
            int expected = 2000;
            int result = Solution.climbStairs(small);
            log("expected = " + expected);
            log("result = " + result);

            if(expected != result) {
                throw new Exception("oops");
            }
        } catch (Exception e) {
            log("yey exeption receiced: " + e.getMessage());
        }
        
    }

    public static void main(String[] args) throws Exception {
        testSmall();
        testMedium();
        testLarge();
        testSuperLargeThowsException();
    }
}
