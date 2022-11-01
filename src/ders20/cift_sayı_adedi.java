package ders20;

public class cift_sayı_adedi {

    public static void main(String[] args) {

        //verilen iki katlı integer arraydeki çift katlı array sayı
        int[][] arr= {{4,6},{3,5,8},{1,0,4}};

        int count=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0)
                    count++;

            }

        }
        System.out.println(count);
    }
}
