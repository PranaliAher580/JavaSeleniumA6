package com.String;

public class InitialLetterUpperCase {
    public static void main(String[] args) {

        String s = " JAVA is a pROGraming LangUAgE";

        s = s.toLowerCase().trim();
        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result = result
                    + Character.toUpperCase(words[i].charAt(0))
                    + words[i].substring(1)
                    + " ";
        }

        System.out.println(result.trim());
    }
}
