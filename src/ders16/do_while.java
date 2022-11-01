package ders16;

public class do_while {

    public static void main(String[] args) {
        int sayı=10;
        int toplam=0;

        do {

            toplam+=sayı;
            sayı++;


        }while (sayı<=12);

        System.out.println(toplam);
    }
}
