package leets;

import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public final class Solution {

    public static void main(String[] args) {
        TestSolution.main(args);
    }

    public int lengthOfLastWord(String s) {
        String[] tokens = s.split("\\s+");

        List<String> stringList = Arrays.asList(tokens);

        Stack<String> stringStack = new Stack<String>();

        stringStack.addAll(stringList);
    
        return stringStack.pop().length();
    }
}