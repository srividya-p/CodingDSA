package String;

public class RecurPermutations {
    public static void main(String args[]) {
        String s = "abcd";

        recurPermutations("", s);
    }

    public static void recurPermutations(String p, String s){
        if(s.length() == 0){
            System.out.println(p+s);
        } else{
            for(int i = 0; i< s.length(); i++){
                recurPermutations(p + s.charAt(i), s.substring(0, i) + s.substring(i+1, s.length()));
            }
        }
    }
}
