package ProgramingA1;

public class Panagram {
    public static void main(String[] args) {

        String s = "The Quick Brown Fox Jumps Over The Lazy Dog";

        s = s.toLowerCase();
        char[] ch = s.toCharArray();

        // Remove duplicates
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    ch[j] = ' ';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z' && ch[i] != ' ') {
                count++;
            }
        }

        System.out.println("Unique alphabets count: " + count);

        if (count == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}
