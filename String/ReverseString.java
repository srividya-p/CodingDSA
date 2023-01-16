package String;

public class ReverseString {

    public static void main(String args[]) {
        String s = "Employment";

        String rev = new StringBuffer(s).reverse().toString();
        System.out.println(rev);

        StringBuilder sb1 = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            sb1.append(s.charAt(i));
        }
        System.out.println(sb1.toString());

        System.out.println(recurReverse(s));
    }

    public static String recurReverse(String s){
        if(s.length() <2){
            return s;
        }

        return recurReverse(s.substring(1)) + s.charAt(0);
    }
    
}
