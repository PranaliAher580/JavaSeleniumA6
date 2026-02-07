package ProgramingA1;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "Silent";
        String s2 = "Listen";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Step 1: Length check
        if (s1.length() != s2.length()) {
            System.out.println("Not An Anagram");
            return;
        }

        // Step 2: Convert to char array
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        // Step 3: Sort
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Step 4: Compare
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not An Anagram");
        }
    }
}
