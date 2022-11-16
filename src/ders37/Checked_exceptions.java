package ders37;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked_exceptions {
    public static void main(String[] args) {
        String dosya_yolu="src/ders36/deneme.txt";
        int k=0;
        try {
            FileInputStream fis=new FileInputStream(dosya_yolu);

            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu yanlıs veya arızalı");
        } catch (IOException e) {
            System.out.println("Dosya okuma veya yazma ile ilgili bir sorun var");
        }

        /*
        Bir kod calisirken birden fazla exception olusma ihtimali varsa
bu kodu calisir hale getirmek icin 4 ihtimal vardir

1- herbir exception ic ice try-catch bloklari kullanmak
2- Bir tane try blogu birden fazla catch blogu olusturmak
3- method signature'na tum exception ihtimallerini yazmak (exceptions handle edilmis olmaz)
4- eger muhtemel exceptiopn'larin tumunu kapsayan, daha genis kapsamli bir exception varsa
   onu kullanmak
         */

    }
}
