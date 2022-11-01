package ders18;

public class array {
    public static void main(String[] args)
    {
        int [] arr1={2,4,6,8,10};

        System.out.println(arr1[2]);//6

        arr1[3]=20;//8 yerine 20 yazar

        System.out.println(arr1[3]);//20

        System.out.println(arr1.length);

        System.out.println(arr1[arr1.length-1]);//son elementi verir

        for (int i = 0; i <arr1.length ; i++)
        {
            System.out.print(arr1[i]+" ");         //tüm elemanlar

        }


    }
}
