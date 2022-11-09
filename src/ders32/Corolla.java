package ders32;

public class Corolla extends Btoyoya {

    Corolla(int p)
    {
        super(5);
        System.out.println("parametreli corolla constructor");
    }
    Corolla()
    {

    }
    Corolla(String str)
    {
        this();
        System.out.println("String parametreli contructor.");
    }
    public static void main(String[] args) {
        Corolla  corolla1=new Corolla();
        System.out.println("=======================");
        Corolla corolla2=new Corolla(3);

        System.out.println("=====================");

        Corolla corolla3=new Corolla("ilker");

    }
}
