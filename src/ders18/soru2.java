package ders18;

public class soru2 {
    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

        int[] arr={1,2,3,5,-1,-4,-6};

        int sonuc=sum(arr);
        System.out.println(sonuc);
    }

    public static int sum(int[] arr)
    {
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>0)
            {
                toplam+=arr[i];

            }

        }
        return toplam;
    }
}
