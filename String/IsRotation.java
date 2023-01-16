package String;

public class IsRotation {
    public static void main(String args[]) {
        String s = "Srividya";
        String r = "vidyasri";
        System.out.println(isRotation(s, r));
    }

    public static boolean isRotation(String s, String r){

        s = s.toLowerCase();
        r = r.toLowerCase();

        String concat = r+r;

        if(concat.indexOf(s) == -1){
            return false;
        }

        return true;
    }
}
