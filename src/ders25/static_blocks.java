package ders25;

public class static_blocks {


    static
    {
        System.out.println("2.statik block");
    }
    static {

        System.out.println("1.statik blok");
    }
    public static void main(String[] args) {

        System.out.println("main method çalıştı");

    }

    static
    {
        System.out.println("3.statik blok");
    }
}
