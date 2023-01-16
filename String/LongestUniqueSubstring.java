package String;

import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String args[]) {
        String s = "aabcdca";

        System.out.println(longestUniqueSubstring(s));
    }

    public static String longestUniqueSubstring(String s) {

        int maxSt = 0;
        int maxLen = 0;

        int currSt = 0;
        int currLen = 0;

        int i;

        HashMap<Character, Integer> charPos = new HashMap<Character, Integer>();

        charPos.put(s.charAt(0), 0);

        for (i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charPos.containsKey(c)) {

                if (charPos.get(c) >= currSt) {
                    currLen = i - currSt;

                    if (currLen > maxLen) {
                        maxSt = currSt;
                        maxLen = currLen;
                    }

                    currSt = charPos.get(c) + 1;
                }

                charPos.replace(c, i);

            } else {
                charPos.put(s.charAt(i), i);
            }
        }
        
        if ((i - currSt) > maxLen) {
            maxLen = currLen;
            maxSt = currSt;
        }

        return s.substring(maxSt, maxSt + maxLen);
    }
}
