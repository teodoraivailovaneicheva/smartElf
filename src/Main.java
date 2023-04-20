import java.util.*;

public class Main {
// In a magical world there is an elf that loves to write the words he hears.
// Every time he hears a word he writes it down. And since he loves words and letters
// so much he checks if the new word is similar to the previous one.
// So he crosses out letters until the two words contain the same letters.
// Please write a program that will help our kind elf.

//Example:
//First word: c o d e w a r s (4 letters removed)
//Second word: h a c k e r r a n k (6 letters removed)
//Result: 10

    public static void main(String[] args){

        String str1 = "codewars";
        String str2 = "hackerrank";

        counter(str1, str2);
    }

    public static void counter(String str, String str2) {

        int count = 0;
        int c = 0;
        ArrayList<String> cache = new ArrayList<>();

        for (int i = 0;i < str.length();i++) {
            String check = str2.substring(i, i+1);
            if (str2.indexOf(check) != -1) {
                // Check to see if we already found the character so we don't count it again
                if (!cache.contains(check)) {
                    cache.add(check);
                    count++;
                }
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str2.indexOf(str.charAt(i)) >= 0) {
                c += 1;
            }
        }
        System.out.println("Number of removed letters: " + ((str.length() - c)+count));
    }
}