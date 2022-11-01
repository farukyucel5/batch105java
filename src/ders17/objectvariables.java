package ders17;

public class objectvariables {
    public static void main(String[] args) {

        //object_variables clasındaki instance variablara nasıl ulaşılır?
        // instance variableslara object uzerinden ulaşılır.


        Main_object_variables per1=new Main_object_variables(); //per1 isminde bir obje olusturuldu.

        System.out.println(per1.personelismi);
        System.out.println(per1.personelyas);

        per1.personelismi="faruk yucel";
        per1.personelyas=35;

        System.out.println(per1.personelismi);
        System.out.println(per1.personelyas);
    }
}
