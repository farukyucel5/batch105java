package pratik;

import java.util.Arrays;

public class Array_sort {

    public static void main(String[] args) {


        //Write a Java program to sort the numeric array given below.
        //int[] arr={1,23,56,34,78,12,123,45,3,7};
        int[] arr={1,23,56,34,78,12,123,45,3,7};

        int[] newarray=sorting(arr);

        System.out.println(Arrays.toString(newarray));//kendimiz method oluşturarak yaptık
        //şimdi aynı işlemi aşağıda hazır method kullanarak yapalım
        Arrays.sort(arr);//sort methodu bir dizinin elemanlarını küçükten büyüğe sıralar.
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sorting(int[] arr)
    {


        for (int i = 0; i < arr.length; i++)
        {
            int bos=0;//her seferinde 0 ataması yapılması gerekiyor ki aşağıda sürekli bos olarak kullanabiliyim
            //aksi takdirde son atadığı değeri alır ve aşağıda eleman değişimi yanlış yapılır.
            for (int j = 0; j < arr.length-1; j++)
            {

                if (arr[j]>arr[j+1])
                {
                    bos=arr[j];
                    arr[j]=arr[j+1];//küçük elemanla büyük eleman yer değiştiriyor.
                    arr[j+1]=bos;


                }

            }
        }

        return arr;

    }


}
