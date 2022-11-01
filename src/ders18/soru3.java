package ders18;

public class soru3 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,2,2,3,4,5};
        int aranan_eleman=2;

        eleman_ara(arr,aranan_eleman);
    }

    public static void eleman_ara(int[]arr,int aranan_eleman)
    {
        int flag=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==aranan_eleman)
            {
                flag++;
            }

        }

        if (flag==0)
            System.out.println("aranan eleman yok");

        else
            System.out.println("aranan eleman "+aranan_eleman + " sayısı "+flag +" defa var");



    }
}
