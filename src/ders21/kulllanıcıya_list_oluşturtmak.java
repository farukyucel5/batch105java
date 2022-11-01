package ders21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kulllanıcıya_list_oluşturtmak {
    public static void main(String[] args)
    {
        /*Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi
        isimleri bize liste olarak dondurecek bir method olusturun.*/


        System.out.println(listeolustur());

    }

    public static List<String> listeolustur()
    {
        List<String> isimler=new ArrayList<>();

        Scanner scan=new Scanner(System.in);

        String girilenisim="";

        while (!girilenisim.equalsIgnoreCase("q"))
        {
            System.out.println("lütfen pass in the value and press q to exit");
            girilenisim=scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q"))
            {
                isimler.add(girilenisim);
            }
        }

        return isimler;
    }
}
