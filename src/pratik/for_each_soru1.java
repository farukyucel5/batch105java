package pratik;

public class for_each_soru1 {
    public static void main(String[] args) {

        //Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //yazdiran bir method olusturun.

        int[] arr={1,2,3,4,5,6,7,8};

        square(arr);
    }

    private static void square(int[] arr)
    {
        int sum=0;
        for (int each:arr)
        {
          int square=each*each;

          sum+=square;
        }

        System.out.println(sum);
    }
}
