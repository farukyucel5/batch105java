package ders40_interface;

public interface InterfaceStaticandDefaultMethoths {
     /* Java 8 ile developer'ların talabi üzerine yeni bir istisnai durum java'ya eklenmiştir
    bir isterface'i yıllar içerisinde yüzlerce class inherit etmiş olabilir.
    sonradan Interface'e eklenen bir abstract method tüm eski child'lar tarafından inherit
    edilmelidir. Aksi takdirde tüm eski child class'lar CTE verecektir

    Java 8 ile birlikte Java, Interface'lere default veya static ile işaretlenmek şartı ile
    body'si olan method eklenmesine izin vermiştir.
    bu sayede interface e sonradan eklenen method body'si olduğu için override edilmek zorunda değil


    Interface içerisinde body'si olan olan method oluşturmak için kullanılan defdauld ve statik keyword arasında
    tek bir fark vardır defauld olarak kullanılanlar obje oluşturularak çağrılır ama statiklere direkt erişileblir

     */

    void method1();
    void method2();


    //Interface'deki tüm method'lar public ve abstract'tır.
    /* Biz Interface'deki bir method deklarasyonuna default yazarsak
    bu access modifier değildir.
     */

    public default void method3() {
        System.out.println("bodyli default");
    }

    public static void method4()
    {
        System.out.println("bodyli static");
    }

}
