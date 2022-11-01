package ders10;

import java.util.Scanner;

public class lastindex {
    public static void main(String[] args) {

        String sentence="Never have I seen such a useful bootcamp up to now ";
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a string: ");
        String word=scan.next();

        int ilkindex=sentence.indexOf(word);
        int sonindex=sentence.lastIndexOf(word);


        if(ilkindex==-1)
        {
            System.out.println("not found");

        } else if (ilkindex==sonindex) {
            System.out.println("cümle metni sadece bir kere içeriyor");
        }
        else
        {
            System.out.println("cümle metni birden fazla içeriyor");
        }
    }
}
