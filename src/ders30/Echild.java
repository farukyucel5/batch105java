package ders30;

public class Echild extends Dparent{
    /*
    kalıtımda child parent'ını seçer insandakinin tersi olarak
    yani sınıf oluşturduğunuzda daha öncekilerden miras almak
    istediğiniz özelliklerin bulunduğunu parent yaparsınız.
    BUNU extends ile yapar
     */

    public static void main(String[] args) {
        Echild child1=new Echild();
        child1.yas=30;
        child1.isim="mahmut";
        child1.isEnough=false;

    }
}
