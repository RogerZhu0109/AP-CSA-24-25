package AdvancedHW;

public class practiceone {
    public static void main(String[] args) {
        String input = "the quick brown fox jumped over the lazy dog or over Veer";
        int[] letterCounts = new int[26];

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = (int) Character.toLowerCase(c) - (int) 'a';
                letterCounts[index]++;
            }
        }

        for (int i = 0; i < letterCounts.length; i++) {
            char letter = (char) (i + 'a');
            System.out.println(letter + ": " + letterCounts[i]);
        }
    }
}