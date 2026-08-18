package com;

public class StrEmpty {

    public static void main(String[] args) {

        String data = "Yellow";
        String reverse = "";
        int vowelCount = 0;
        int consonantCount = 0;

        // Check if string is empty
        if (data.isEmpty()) {
            System.out.println("The string is empty");
        } else {
            System.out.println("The string is not empty");
        }

        // Reverse the string
        for (int i = data.length() - 1; i >= 0; i--) {
            reverse += data.charAt(i);
        }

        System.out.println("Original string: " + data);
        System.out.println("Reversed string: " + reverse);

        // Check palindrome
        if (data.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        // Count vowels and consonants
        boolean hasVowel = false;

        for (int i = 0; i < data.length(); i++) {

            char ch = data.charAt(i);

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                hasVowel = true;
                vowelCount++;

                System.out.println("Vowel found: " + ch);

            } else if (Character.isLetter(ch)) {

                // If it is a letter and not a vowel, it is a consonant
                consonantCount++;

                System.out.println("Consonant found: " + ch);
            }
        }

        // Display vowel information
        if (hasVowel)
        {
            System.out.println("The string contains vowels");
        }
        else
        {
            System.out.println("The string does not contain vowels");
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}

