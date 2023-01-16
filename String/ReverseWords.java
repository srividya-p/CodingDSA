package String;

public class ReverseWords {

    public static void main(String args[]) {
        String s = "   Who let   the Dogs out?  ";

        String words[] = s.replaceAll("\\s{2,}", " ").trim().split("\\s");
        StringBuilder reverse = new StringBuilder(s.length());

        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
            reverse.append(" ");
        }

        System.out.println(reverse.toString());
    }

}
