package leets;

import java.util.ArrayList;

public class Solution {

    private static int[] possibleStepTypes = {1,2};

    public static void step(int type, int pos, int size, ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> currentPath) {
        // return early in case the amount of steps goes over the board
        if (pos + type > size) {
            return;
        }

        // push new path in to array and call it self o nnew position
        ArrayList<Integer> newPath = new ArrayList<Integer>(currentPath);
        newPath.add(type);
        
        if(pos + type == size) {
            paths.add(newPath);
        }
        

        for(int i = 0; i < possibleStepTypes.length; i++) {
            step(possibleStepTypes[i], pos + type, size, paths, newPath);
        }
        
    }


    public static int climbStairs(int n) { 
        int boardSize = n;
        if (boardSize > 45) {
            throw new Error("nope");
        }
        ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
        int pos = 0;
        ArrayList<Integer> currentPath = new ArrayList<Integer>();

        for(int i = 0; i < possibleStepTypes.length; i++) {
            step(possibleStepTypes[i], pos, boardSize, paths, currentPath);
        }

        // at this point paths contains all possible paths
        return paths.size();
    }
}
