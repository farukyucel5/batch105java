package ders28;

public class varargs3 {
    public static void main(String[] args) {
        method1(1,4,5,6,7,8);

    }

    public static void method1(int a,int b,int c,int... sayılar)
    {

    }

    /*public static void method1(int... sayılar,int a)
    {
        method'da parametre olarak varargs varsa sonda olmalıdır
        dolayısı ile 2 varargs da  parametre olarak olmaz.
    }*/
}
