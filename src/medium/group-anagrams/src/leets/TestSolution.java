package leets;

import java.util.ArrayList;
import java.util.List;

public class TestSolution {
    public static void main(String[] args) {
        testSmallArray();
    }

    public static void testSmallArray() {
        String[] input = {"abc", "acb", "acs","sca"};
        List<List<String>> expected = new ArrayList<List<String>>();
        ArrayList<String> group1 = new ArrayList<String>();
        ArrayList<String> group2 = new ArrayList<String>();
        group1.add("abc");
        group1.add("acb");
        group2.add("acs");
        group2.add("sca");
        expected.add(group1);
        expected.add(group2);

        Solution sln = new Solution();
        List<List<String>> result = sln.groupAnagrams(input);
        
        
        List resultGroup1 = result.get(0);
        List resultGroup2 = result.get(1);

        if(!group1.equals(resultGroup1)) {
            System.out.println("Error: expected " + group1.toString() + " got " + resultGroup1.toString());
        }
        if(!group1.equals(resultGroup1)) {
            System.out.println("Error: expected " + group2.toString() + " got " + resultGroup2.toString());
        }

        
    }
}
