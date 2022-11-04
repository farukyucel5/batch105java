package ders29;

public class access2 {
    public static void main(String[] args) {
        access_modifier obj=new access_modifier();

        obj.isim="tugay";
        System.out.println(obj.isim);

        access_modifier obj1=new access_modifier();

        System.out.println(obj1.isim);
    }
}
