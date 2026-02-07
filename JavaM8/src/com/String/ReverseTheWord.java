package com.String;

public class ReverseTheWord {
    public static void main(String[] args) {

        String s = "Java Is A Programming Language";
        String[] s1 = s.split(" ");
        String s2 = "";

        for (int i = 0; i < s1.length; i++) {
            String s3 = "";

            for (int j = s1[i].length() - 1; j >= 0; j--) {
                s3 = s3 + s1[i].charAt(j);
            }

            s2 = s2 + s3 + " ";
        }

        System.out.println(s2.trim());
    }
}
