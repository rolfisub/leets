package leets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> linkedSet = new LinkedHashSet<Integer>();
        
        for(int n: nums) {
            linkedSet.add(n);
        }

        Integer[] nums2 = linkedSet.toArray(new Integer[0]);

        for(int i = 0; i < nums2.length; i++) {
            nums[i] = nums2[i].intValue();
        }

        return linkedSet.size();
    }
}
