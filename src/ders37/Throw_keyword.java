package ders37;

public class Throw_keyword {
    public static void main(String[] args) {
        int sayı = 1;
        try {
            sayı = 2;
            if (sayı == 2)
                throw new RuntimeException();

            sayı = 3;

            sayı = 4;

            sayı = 5;

        }catch (RuntimeException e)
        {

        }

        sayı = 6;

        System.out.println(sayı);
    }
}
