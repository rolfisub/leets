package leets;

import java.util.ArrayList;
import java.util.Arrays;

public final class Solution {

    public static void main(String[] args) {
         TestSolution.main(args);
    }

    public int removeElement(int[] nums, int val) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int n:nums) {
            if(n != val) {
                result.add(n);
            }
        }
        
        for(int i = 0; i < result.size(); i++) {
            nums[i] = result.get(i);
        }
        
        Arrays.sort(nums, 0, result.size());

        return result.size();
    }
}