package ders17;

public class scope {

    //class level variables are supposed to be created out of the methods.
    static String hastaneismi="faruk";
    static int hastasayısı=23451;
    static String bashekim;
    String personelismi;
    String personetel;
    int personelyas;

    public static void main(String[] args) {
        System.out.println(hastaneismi);
        System.out.println(bashekim);
        //static methodun içinde static olan değiskenler kullanılabilir.

    }

    public static void method1()
    {
        System.out.println(hastaneismi);

    }

    public void method2()
    {
        System.out.println(hastaneismi);
        System.out.println(personelismi);//static olmayanlar static olmayan methodun içinde kullanılabilir.
    }
}
