package String;

import java.util.*;

public class Anagram {
    public static void main(String args[]) {
        String word = "stauday";
        String anagram = "adustay";

        System.out.println(checkAnagram1(word, anagram));
        System.out.println(checkAnagram2(word, anagram));
    }

    public static String checkAnagram1(String word, String anagram) {
        
        if(word.length() != anagram.length()){
            return "The Strings are not Anagrams.";
        }

        char[] chars = word.toCharArray();

        for(char c: chars){
            int char_index = anagram.indexOf(c);

            if(char_index != -1){
                anagram = anagram.substring(0, char_index) + anagram.substring(char_index+1, anagram.length());
            } else{
                return "The Strings are not Anagrams.";
            }
        }
        return "The Strings are Anagrams.";
    }

    public static String checkAnagram2(String word, String anagram) {
        char[] word_arr = word.toCharArray();
        char[] anagram_arr = anagram.toCharArray();

        Arrays.sort(word_arr);
        Arrays.sort(anagram_arr);

        if(! Arrays.equals(word_arr, anagram_arr)) {
            return "The Strings are not Anagrams.";
        }
        return "The Strings are Anagrams.";
    }
}