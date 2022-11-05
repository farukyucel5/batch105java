package ders30;

public class encapsulation {
    public static void main(String[] args) {

        Aencapulation pers1=new Aencapulation();

       // pers1.hemsire_adresi="Ankara";
       // pers1.hemsire_ismi="Ayse";private ulaşılamazlar.
        System.out.println(pers1.getHospital_name());//atama yapılamaz,bu bize bir değer getirir
        pers1.setHasta_ucreti(500);//yazdıramazsınız,sadece değer atayabilirsiniz.
        System.out.println(pers1.getHemsire_adresi());//null döndürür çünkü kaynak sınıfta default da değer atanmadı.
        pers1.setHemsire_adresi("istanbul");//atama yapıldı
        System.out.println(pers1.getHemsire_adresi());//istanbul
    }
}
