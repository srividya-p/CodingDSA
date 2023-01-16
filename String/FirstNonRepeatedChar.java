package String;

import java.util.*;

public class FirstNonRepeatedChar {
    public static void main(String args[]) {
        String s = "abbcddee";

        System.out.println(firstNonRepeatedChar1(s));
        System.out.println(firstNonRepeatedChar2(s));
    }

    public static String firstNonRepeatedChar1(String s){
        
        LinkedHashMap<Character, Integer> counts = new LinkedHashMap<>();

        for(char c: s.toCharArray()){
            counts.put(c, counts.containsKey(c)? counts.get(c)+1 : 1);
        }

        for(Map.Entry<Character, Integer> mapEntry : counts.entrySet()){
            if(mapEntry.getValue() == 1){
                return Character.toString(mapEntry.getKey());
            }
        }
        return "None";
    }

    public static String firstNonRepeatedChar2(String s){
        Set<Character> repeat = new HashSet<>();
        List<Character> non_repeat = new ArrayList<>();

        for (char c: s.toCharArray()) {
            if(repeat.contains(c)){
                continue;
            }

            if(non_repeat.contains(c)){
                non_repeat.remove((Character)c);
                repeat.add(c);
            } else{
                non_repeat.add(c);
            }
        }

        if(!non_repeat.isEmpty()){
            return Character.toString(non_repeat.get(0));
        }
        return "None";
    }
}
