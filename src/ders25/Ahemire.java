package ders25;

public class Ahemire {


   static String hastane_ismi="Yıldız hastanesi";
   static String adres="cankaya/ANKARA";
    static String bashekim="Dr mehmet yılmaz";

    String personelısmi="isim belirtilmedi";
    String personeladresi="isim belirtilmedi";
    String personeltelefonu="isim belirtilmedi";
    public static void main(String[] args) {


    }

    @Override
    public String toString() {
        return "Ahemire{" +
                "personelısmi='" + personelısmi + '\'' +
                ", personeladresi='" + personeladresi + '\'' +
                ", personeltelefonu='" + personeltelefonu + '\'' +
                "\n bashekim "+bashekim+
                '}';
    }
}
