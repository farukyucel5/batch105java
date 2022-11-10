package ders33;

public class Favcıkuslar extends Ekuslar{
    public void hareket()
    {
        System.out.println("Avcı kuslar ucarlar");
    }

    public void beslenme()
    {
        System.out.println("Avcı kuslar et yerler");
    }
    public void pence()
    {
        System.out.println("Avcı kuslar pencelidir");
    }
    public void gaga()
    {
        System.out.println("Avcı kuslar gagalıdır");
    }

    public static void main(String[] args) {
        /*
        constructor ve data türü aynı ise hangi methodun gecerli olduğunu bulmak için o sınıfa
        gider varsa kullanırız yoksa parentlara gider ilk bulduğumuzu kullanırız.
         */

        Favcıkuslar avcı1=new Favcıkuslar();
        avcı1.beslenme();//Favcıkuslar
        avcı1.gaga();//Favcıkuslar
        avcı1.pence();//FAvcı kuslar
        avcı1.hareket();//FAvcı kuslar
        avcı1.cogalma();//Ekuslar
        avcı1.kanat();//Ekuslar
        avcı1.omur();//Hayvanlar
        avcı1.solunum();//Kuslar

        Ekuslar avcı2=new Favcıkuslar();
        /*
        bir obje olusturulurken data türü ile constructor farklı ise hangi methodun gecerli olduğunu bulmak için
        önce data türünün oldugu sınıf ve parentlaına bakarak o methodu buluruz bulamazsak cte verir bulursak hemen
        calıstırmayız önce override edilmis mi diye bakarız eğer edilmisse override edeni alırız.
         */

        avcı2.beslenme();//Favcıkuslar
        avcı2.gaga();//Favcıkuslar
       // avcı2.pence();//cte verir cunku hem data türünün sınıfında hemde parent sınıfta yok.
        avcı2.hareket();//FAvcı kuslar
        avcı2.cogalma();//Ekuslar
        avcı2.kanat();//Ekuslar
        avcı2.omur();//Hayvanlar
        avcı2.solunum();//Kuslar

        Dhayvanlar avcı3=new Favcıkuslar();

        avcı3.beslenme();//Favcıkuslar
       // avcı3.gaga();//CTE VERİR data türü sınıfında yoktur.
        //avcı3.pence();//CTE
        avcı3.hareket();//FAvcı kuslar
        avcı3.cogalma();//Ekuslar
        //avcı3.kanat();//CTE
        avcı3.omur();//Hayvanlar
        avcı3.solunum();//Kuslar

        Ekuslar kus1=new Ekuslar();
        kus1.cogalma();//Ekuslar
        kus1.gaga();//Ekuslar
        kus1.kanat();//Ekuslar
        kus1.hareket();//Dhayvanlar
        kus1.solunum();//Ekuslar
        kus1.beslenme();//Dhayvanlar
        kus1.omur();//Dhayvanlar



    }

}
