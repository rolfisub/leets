import leets.Solution;

public class App {

    public static void log(String str) {
        System.out.println(str);
    }

    
    public static void testSmallInput(Solution solution)  {
        log("testSmallInput: [1,2]");
        int[] nums = {1,2};
        int[] expectedNums = {1,2};
        int expectedSize = 2;
        int result = solution.removeDuplicates(nums);
        log("expectedSize: " + expectedSize);
        log("result: " + result);
        if (expectedSize != result) {
            log("Error not equal");
        }
        for(int i = 0; i < result; i++) {
            if(nums[i] != expectedNums[i]) {
                log("Error arrays are different");
                log(nums.toString());
                log(expectedNums.toString());
            }
        }
    }

    public static void testMediumInput(Solution solution)  {
        log("testMediumInput: [1,1,1,1,2,2,2,3,4,5]");
        int[] nums = {1,1,1,1,2,2,2,3,4,5};
        int[] expectedNums = {1,2,3,4,5};
        int expectedSize = 5;
        int result = solution.removeDuplicates(nums);
        log("expectedSize: " + expectedSize);
        log("result: " + result);
        if (expectedSize != result) {
            log("Error not equal");
        }
        for(int i = 0; i < result; i++) {
            if(nums[i] != expectedNums[i]) {
                log("Error arrays are different");
                log(nums.toString());
                log(expectedNums.toString());
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        testSmallInput(solution);
        testMediumInput(solution);

    }
}
