package ders17;

public class classvariables {
    public static void main(String[] args) {

        System.out.println(Main_object_variables.hastaneismi);
        System.out.println(Main_object_variables.hastasayısı);

        method1();

        System.out.println(Main_object_variables.hastasayısı);
    }

    public static void method1()
    {

        Main_object_variables.hastasayısı++;
    }
}
