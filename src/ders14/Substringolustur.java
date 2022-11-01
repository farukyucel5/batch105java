package ders14;

public class Substringolustur {

    public static void main(String[] args) {

        String str="bunu nasıl yapacağız";
        int bas=5;
        int bitis=7;

        substr(str,bas,bitis);


    }

    public static void substr(String a,int initial,int end)
    {

        if(initial>end)
        {

            System.out.println("hata hata hata ");
        } else if (end>=a.length()) {

            System.out.println("out of bound");

        }else
        {

        for (int i = initial; i<end ; i++) {

            System.out.println(a.charAt(i));

        }

        }

    }
}
