package ders40_interface;

public interface Interface1 {
    String MESAJ="Hello interface";
    //ınterface'ler özel yapı olduklarından
    //tüm methodlar public sataic ve final'dir yazılsada yazılmasa da
    static int SAYI=20;//yazınca gri yapıp gereksiz olduğunu söyler çünkü zaten statik o
    public static boolean GUZELMI=true;//aynısı burada da geçerli

    int SAYI2=30;
    void method1();
    abstract int method2();
    public abstract  String method3();
}
