package ders13;

public class forloop {

    public static void main(String[] args) {


        String input="java her gecen gün güzelleşsiyor";

        String tersinput="";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersinput+=input.substring(i,i+1);

        }

        System.out.println("ters hali :"+tersinput);


    }

}
