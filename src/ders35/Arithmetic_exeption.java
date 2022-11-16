package ders35;

public class Arithmetic_exeption {
    public static void main(String[] args) {
        //verilen iki tamsayıyı birbirine bölüp tam sayı kısmını yazdırın.
        int sayı1=20;
        int sayı2=0;

        try {
            System.out.println(sayı1/sayı2);
            System.out.println("let me check whether this line works or not");
        } catch (Exception e) {
            System.out.println("sayı sıfıra bölünemez");
        }
    }
}
