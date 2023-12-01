package leets;

class Solution {

    public static void main(String[] args) {
        Solution.main(args);
    }
        
    public void rotate(int[] nums, int k) {
        int steps = k % nums.length;
        int direction = 1;
        if(steps > nums.length / 2) {
            direction = -1;
            steps = nums.length - steps;
        }
        for (int i = 0; i < steps; i++) {
            if(direction == 1) {
                shiftOneRight(nums);
            } else {
                shiftOneLeft(nums);
            }
        }
    }

    public void shiftOneRight(int[] nums) {
        int lastElement = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = lastElement;
    }

    public void shiftOneLeft(int[] nums) {
        int firstElement = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = firstElement;
    }

    void log(String str) {
        System.out.println(str);
    }
}