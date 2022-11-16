package ders37;

public class throw3_finally {
    public static void main(String[] args) {
        String a = null;
        String b = "";
        try {
            try {

                b = b + "a";
                a.length();
                b = b + "b";
            } catch (NullPointerException e) {
                b = b + "c";
            } finally {
                b = b + "d";
                throw new RuntimeException();//ne olursa olsun daima yapılacak olan.
            }
        } catch (Exception e) {
            b = b + "e";
            System.out.println(b);
        }
    }
}
