package ders34;

public class Dchild extends Cparent{
    //overrring kuralları.
    //access modifierler farklı olabilir.
    //child parent'ı sınırlandıramaz.
    //yani overrriding methodun access modifier'i overriden ile  ya aynı ya da daha geniş olmalıdır.

    public void method1()
    {

    }

    //2-private ve static methodlar override edilemez.

    /*public void method2()
    {

    }*/

    //3-return typeları farklı olabilir ama return type void veya primitive ise aynı olmak zorunda.
    //eğer return typelar non-primitive ise child sınıf'daki return type parent soınıftaki return type'ın
    //child'ı veya aynı olmalıdır.object--string,integer vb..

    public String method5()
    {
        return "";
    }



}
