package ders20;

public class en_uzun_kelime {
    public static void main(String[] args)
    {
        //verilen string bir arraydeki en uzun stringi yazdırın

        String [][] arr= {{"Ilker","Nesrin"} ,{"Hasan","Heysem","Adem","Yusuf Enes"}};

        String enuzun=arr[0][0];


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].length()>enuzun.length())
                {
                    enuzun=arr[i][j];
                }

            }

        }

        System.out.println(enuzun);



    }
}
