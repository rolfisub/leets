package utils;

public class Logger {

    public static String arrayIntegerContentsToString(int[] arr) { 
        StringBuilder str = new StringBuilder("");

        str.append("[");
        for(int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
            if(i != arr.length - 1) {
                // not the last element
                str.append(", ");
            }
        }
        str.append("]");

        return str.toString();
    }

    public static void log(String str) {
        System.out.println(str);
    }
}
