package leets;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int maxCount = 0;
        int maxKey = 0;
        for(int n:nums) {
            if (numMap.containsKey(n)) {
               Integer count = numMap.get(n);
               numMap.put(n, ++count); 
               if (count > maxCount) {
                  maxCount = count;
                  maxKey = n;
               }
            } else {
               numMap.put(n, 1);
               if (1 > maxCount) {
                maxCount = 1;
                maxKey = n;
               }
            }
        }
        return maxKey;
    }
}
