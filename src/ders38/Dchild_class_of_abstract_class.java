package ders38;

public class Dchild_class_of_abstract_class extends C_parent_abstract_class{
    //Abstract bir sınıftaki abstract methodların tamamı concrede child sınıflar tarafından override edilmelidir.
    @Override
    public void mecburimethod1() {
        System.out.println("child class method içerisinde method'u kendine uyarlar");
    }

    @Override
    public void mecburimethod2() {

    }
}
