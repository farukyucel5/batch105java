package ders38;

public abstract class C_parent_abstract_class {
    /*
    Abstract bir class abstract methodlara sahib olabilir.
    class declerationa abstract eklenir.

     */
    public abstract void mecburimethod1();

    public abstract void mecburimethod2();
    //abstract methodların body'si olmaz!!

    public String concreteMethod()
    {
        return "";
    }

    /*
Bir parent class'da child class'ların mutlaka override edeceği bir method olusturdugumuzda
method body'si gereksizlerşir cünkü hiç çalışmayacaktır

1- Abstract Parent class'dan obje oluşturulamayacağı için objeler için bu method kullanılamaz
2-Chıld class'larda mecburen bu method'u override edeceklerinden, bu merhod'ların body'si asla
KULLANILMAYACAKTIR.
Java hiç kullanılmayacak bu method body'leri yazmamamıza imkan tanımıştır.

Chıld class'ların mutlaka override etmesini istediğimiz method'ları abstract olarak tanımlar ve
body'siz olarak oluştururuz.
 */

}
