package leets;

public class Solution {
    private static void log(String str) {
        System.out.println(str);
    }
    public static int searchInsert(int[] nums, int target) {
        log("check for last int");
        int lastInt = nums[nums.length - 1];
        if (lastInt < target) {
            log("last int was less than target");
            return nums.length;
        }
        log("target: "+ target);
        for(int i = 0; i < nums.length; i++) {
            log("index: " + i);
            int val = nums[i];
            log("value: "+ val);
            if (val == target) {
                log("value is equal to target" + val);
                log("returning index:" + i);
                return i;
            }
            if (val < target) {
                log("value is less than target " + val + "," + target);
                int nextIndex = i + 1;
                log("next index is: " + nextIndex);
                if (nextIndex < nums.length) {
                    int nextVal = nums[nextIndex];
                    log("next value is: " + nextVal);
                    if (nextVal > target) {
                        log("next value is greater than target " + nextVal);
                        return nextIndex;
                    }
                }
            }
        }
        log("no case found, returning 0");
        return 0;
    }
}
