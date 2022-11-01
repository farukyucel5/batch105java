package ders22;

public class for_each {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9};

        int sum=0;

        for (int each:arr)  //arr'ye git her bir integeri getir.
        {
            if(each>5)
            {
                sum+=each;
            }
        }
        System.out.println(sum);



    }
}
