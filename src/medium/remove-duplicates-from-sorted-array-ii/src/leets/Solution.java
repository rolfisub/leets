package leets;

import java.util.HashMap;
import java.util.LinkedList;

class Solution {
    public static void main(String[] args) {
        SolutionTest.main(args);
    }

    public int removeDuplicates(int[] nums) {
        // map of counts per value
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        
        // result linked list
        LinkedList<Integer> resultList = new LinkedList<Integer>();

        // iterate over nums and create map and result
        for(int i = 0; i < nums.length; i++) {
            // does it exist?
            Integer value = nums[i];
            Boolean exists = counts.containsKey(value);
            
            if (exists) {
                // if yes we check the count, if == 2 then we ignore
                // if yes and the count is < 2 then we add to result and increase the count
                Integer count = counts.get(value);
                if (count.intValue() < 2) {
                    resultList.add(value);
                    counts.put(value, ++count);
                }
            } else {
                //
                // if no, then add to result, add to map and set count to 1
                Integer initial = 1;
                counts.put(value, initial);
                resultList.add(value);
            }
        }

        // iterate over result list and apply to nums
        for(int i = 0; i < resultList.size(); i++) {
            nums[i] = resultList.get(i);
        }
        return resultList.size();
    }
}
