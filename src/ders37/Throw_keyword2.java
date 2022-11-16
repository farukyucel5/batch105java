package ders37;

public class Throw_keyword2 {
    public static void main(String[] args) {
        String a = null;
        String b = "";
        try {
            try {
                int c = a.length() + b.length();
            } catch (NullPointerException e) {
                if (b.length() == 0) {
                    throw new RuntimeException();
                }
                System.out.println("null pointer'dir, uzunlugu olmaz");
            }
        } catch (RuntimeException e) {
            System.out.println("throw keyword");
        }
    }
}
