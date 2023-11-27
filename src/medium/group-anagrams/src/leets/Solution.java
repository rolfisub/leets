package leets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> mapResult = new HashMap<String,ArrayList<String>>(0);

        for (String str : strs) {
            String hash = this.getAnagramHash(str);
            if (mapResult.containsKey(hash)) {
                ArrayList<String> group = mapResult.get(hash);
                group.add(str);
                mapResult.put(hash, group);
            } else {
                ArrayList<String> group = new ArrayList<String>();
                group.add(str);
                mapResult.put(hash, group);
            }
        }
        
        List<List<String>> result = new ArrayList<>();
        for( Map.Entry<String, ArrayList<String>> entry: mapResult.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

    public String getAnagramHash(String value) {
        char[] chars = value.toCharArray();
        Arrays.sort(chars);
        StringBuilder str = new StringBuilder();
        for(char c: chars) {
            str.append(c);
        }
        return str.toString();
    }
}
