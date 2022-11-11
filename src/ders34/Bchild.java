package ders34;

public class Bchild extends Aparent{

    public void method1()
    {
        System.out.println("child sınıf method1");
    }
    //override olabilmesi için signiture aynı olması lazım

    public void method2(int a)
    {
        System.out.println("child sınıf method2");
    }

    @Override
    public void method3() {
        //super.method3();kullanılırsa hem overridden hem de overriding method kullanılır.
        //overriding method @override ile işaretlenebilir isteğe bağlı
    }

    public  void method2(String isim)
    {
        System.out.println("child sınıf string parametreli method2");
    }
}
