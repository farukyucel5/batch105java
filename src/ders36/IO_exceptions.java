package ders36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IO_exceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis =new FileInputStream("src/ders36/deneme.txt");
        FileOutputStream fos=new FileOutputStream("src/ders36/deneme.txt");
        //java ile bilgisayardaki bir dosyaya erismek istersek bu sınıftan obje olusturup
        //o dosyayı kullanabiliriz
        //fis olustururken ulasmak istedigimiz dosyanın dosya yolunu parametre olarak girmeliyiz

        /*
        checked exception olusturma ihtimali olan kodları yazdıgımızda
        java compile time da orada bir hata oldugunu görür ve kodun altını kırmızı cizer

        bu durumda kırmızı cizgiyi kaldırmak icin
        1. exceptionu try catch ile sarmak
        2. java'ya  sorunun farkında oldugumuzu  ama kodumuza guveniyoruz calısmaya devam et diyoruz
        bunun icin throws anahtar kelimesini ekliyoruz.
         */


    }
}
