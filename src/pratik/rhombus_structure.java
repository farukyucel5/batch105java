package pratik;

import java.util.Scanner;

public class rhombus_structure {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int num=scan.nextInt();

        char first='A';
        String word="";
        String inverse_word="";

        int space=num;
        for (int i = 0; i <num ; i++)
        {

            for (int j =space; j >1; j--)
            {
                System.out.print(" ");

            }

            word+=first;

            for (int j = word.length()-2; j>=0; j--)
            {
                inverse_word+=word.charAt(j);

            }

            System.out.println(word+inverse_word);
            inverse_word="";


            first++;
            space--;

        }

        String newstr;
        space=num;
        String inverse="";

        for (int i = 0; i < num-1; i++) {


            for (int j = 0; j<i+1 ; j++)
            {
                System.out.print(" ");
            }

            newstr=word.substring(0,space-1);

            for (int j = newstr.length()-2; j>=0 ; j--)
            {
                inverse+=newstr.charAt(j);
            }

            System.out.println(newstr+inverse);

            space--;
            inverse="";

        }

    }
}
