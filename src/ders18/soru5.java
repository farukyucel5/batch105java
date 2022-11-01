package ders18;

public class soru5 {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        String [] sentence={"hasan","adem","şenturk","ömer faruk"};

        longone(sentence);
    }


    public static void longone(String [] str)
    {
        String enuzun=str[0];
        String enkısa=str[0];

        for (int i = 1; i <str.length ; i++) {

            if (str[i].length()>enuzun.length())
            {
                enuzun=str[i];
            }
            if (str[i].length()<enkısa.length())
            {
                enkısa=str[i];
            }



        }

        System.out.println("en uzun "+enuzun);
        System.out.println("en kısa "+enkısa);


    }
}
