package ders10;

import java.util.Scanner;

public class index_of {

    public static void main(String[] args) {


        String sentence="Never have I seen such a useful bootcamp up to now ";
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a string: ");
        String word=scan.next();

        int konum =sentence.indexOf(word);
        int konum1=sentence.indexOf(word,konum+1);

        if(konum==-1)
        {
            System.out.println("Not found in the text");
        } else if (konum>=0 && konum1==-1) {
            System.out.println("there is only one of this word in the text");


        } else if (konum1>=0) {
            System.out.println("there are at least two of these words in the text");

        }

        else
        {
            System.out.println("yanlış giriş");
        }


    }
}
