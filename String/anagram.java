package String;

public class anagram {
    public static void main(String args[]) {
        System.out.println(isAna("study", "dus y"));
    }

    public static boolean isAna(String w, String a) {

        if (w.length() != a.length()) {
            return false;
        }

        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);

            if (a.indexOf(c) != -1) {
                a = a.substring(0, a.indexOf(c)) + a.substring(a.indexOf(c) + 1, a.length());
            } else {
                return false;
            }
        }

        return a.isEmpty();

    }

}
