package com.String;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String s = "MALAYALAM";

        char[] ch = s.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (ch[i] == ch[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result.append(ch[i]);
            }
        }

        System.out.println(result.toString());
    }
}
