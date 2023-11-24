import leets.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        
        testEqual();
        testInBetween();
        testLast();
        testAfterLast();
    }

    public static void testEqual () throws Exception {
        int nums[] = {1,3,5,6};
        int tar = 3;
        int expected = 1;
        int result = Solution.searchInsert(nums, tar);

        System.out.println("expected: " + expected);
        System.out.println("result: " + result);

        if(expected != result) {
            throw new Exception("error");
        }
    }

    public static void testInBetween () throws Exception {
        int nums[] = {1,3,5,6};
        int tar = 4;
        int expected = 2;
        int result = Solution.searchInsert(nums, tar);

        System.out.println("expected: " + expected);
        System.out.println("result: " + result);

        if(expected != result) {
            throw new Exception("error");
        }
    }

    public static void testLast () throws Exception {
        int nums[] = {1,3,5,6};
        int tar = 6;
        int expected = 3;
        int result = Solution.searchInsert(nums, tar);

        System.out.println("expected: " + expected);
        System.out.println("result: " + result);

        if(expected != result) {
            throw new Exception("error");
        }
    }

    public static void testAfterLast () throws Exception {
        int nums[] = {1,3,5,6};
        int tar = 7;
        int expected = 4;
        int result = Solution.searchInsert(nums, tar);

        System.out.println("expected: " + expected);
        System.out.println("result: " + result);

        if(expected != result) {
            throw new Exception("error");
        }
    }
}
