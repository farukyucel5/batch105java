package ders20;

public class carpım {

    public static void main(String[] args) {
        int[][] arr = {{5, 7}, {5, 8, 9}, {0, 1}};


        int result = muttiply(arr);

        System.out.println("the result: " + result);

    }


    public static int muttiply(int[][] arr) {
        int Carpim = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Carpim *= arr[i][j];
            }


        }

        return Carpim;


    }
}
