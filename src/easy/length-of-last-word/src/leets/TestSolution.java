package leets;

public final class TestSolution {

    private static int errors = 0;
    public static void main(String[] args) {
        testShortString();
        testMultiSpaceShortString();
        testShortStringEndingOnInteger();
        testShortStringEndingOnDouble();
        testShortStringTabs();
        testShortStringSpecialChar1();
        testShortStringSpecialChar2();
        testShortStringSpecialChar3();
        testShortStringSpecialChar4();

        if (errors > 0) {
            System.out.println("Error, not all tests passed, there were " + errors + " errors.");
        }
    }

    
    /**
     * 1. test short strings
     * 2. test multiple space strings
     * 3. test integer
     * 4. test double
     * 5. test tab carachter
     * 6. test special chars
     */

     public static void testShortString() {
        Solution sln = new Solution();
        String input = "one two";
        Integer result = sln.lengthOfLastWord(input);
        Integer expected = 3;
        System.out.println("-testShortString-");
        System.out.println("input: " + input);
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        if (result != expected) {
            System.out.println("Error");
            errors++;
        }
     }

     public static void testMultiSpaceShortString() {
        Solution sln = new Solution();
        String input = "one two   hello";
        Integer result = sln.lengthOfLastWord(input);
        Integer expected = 5;
        System.out.println("-testMultiSpaceShortString-");
        System.out.println("input: " + input);
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        if (result != expected) {
            System.out.println("Error");
            errors++;
        }
     }

     public static void testShortStringEndingOnInteger() {
        Solution sln = new Solution();
        String input = "one two   hello 345";
        Integer result = sln.lengthOfLastWord(input);
        Integer expected = 3;
        System.out.println("-testShortStringEndingOnInteger-");
        System.out.println("input: " + input);
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        if (result != expected) {
            System.out.println("Error");
            errors++;
        }
     }

     public static void testShortStringEndingOnDouble() {
        Solution sln = new Solution();
        Double dub = 45.678;
        String input = "one two   hello 345 " + dub;
        Integer result = sln.lengthOfLastWord(input);
        Integer expected = 6;
        System.out.println("-testShortStringSpecialChar4-");
        System.out.println("input: " + input);
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        if (result != expected) {
            System.out.println("Error");
            errors++;
        }
     }

      public static void testShortStringTabs() {
        Solution sln = new Solution();
        String input = "one two   hello 345\tcasa";
        Integer result = sln.lengthOfLastWord(input);
        Integer expected = 4;
        System.out.println("-testShortStringTabs-");
        System.out.println("input: " + input);
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        if (result != expected) {
            System.out.println("Error");
            errors++;
        }
     }

     
    
     public static void testShortStringSpecialChar1() {
        Solution sln = new Solution();
        String input = "one two   hello 345,perro";
        Integer result = sln.lengthOfLastWord(input);
        Integer expected = 5;
        System.out.println("-testShortStringSpecialChar1-");
        System.out.println("input: " + input);
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        if (result != expected) {
            System.out.println("Error");
            errors++;
        }
 }

 public static void testShortStringSpecialChar2() {
        Solution sln = new Solution();
        String input = "one two   hello 345.perros";
        Integer result = sln.lengthOfLastWord(input);
        Integer expected = 5;
        System.out.println("-testShortStringSpecialChar2-");
        System.out.println("input: " + input);
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        if (result != expected) {
            System.out.println("Error");
            errors++;
        }
 }

 // this is a valid number so it should be considered a word
 public static void testShortStringSpecialChar3() {
        Solution sln = new Solution();
        String input = "one two   hello 34,504";
        Integer result = sln.lengthOfLastWord(input);
        Integer expected = 6;
        System.out.println("-testShortStringSpecialChar3-");
        System.out.println("input: " + input);
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        if (result != expected) {
            System.out.println("Error");
            errors++;
        }
 }


 // this is a valid number so it should be considered a word
 public static void testShortStringSpecialChar4() {
        Solution sln = new Solution();
        String input = "one two   hello 34.5";
        Integer result = sln.lengthOfLastWord(input);
        Integer expected = 4;
        System.out.println("-testShortStringSpecialChar4-");
        System.out.println("input: " + input);
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        if (result != expected) {
            System.out.println("Error");
            errors++;
        }
 }

}
