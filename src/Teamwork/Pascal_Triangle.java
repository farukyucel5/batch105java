package Teamwork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
       /*
       Given an integer numRows, return the first numRows of Pascal's triangle.
       In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
       Example 1:
   Input: numRows = 5
   Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    Example 2:
    Input: numRows = 1
    Output: [[1]]
        */
        Scanner obj=new Scanner(System.in);
        System.out.println("Tap in a number:  ");
        int numrow=obj.nextInt();

        List<List> pascal=new ArrayList<>();

        if (numrow>2)
        {
          pascal.add(0, List.of(1));
          pascal.add(1,List.of(1,1));

          for (int i = 1; i < numrow - 1; i++) {
              List<Integer> sublist = new ArrayList<>();

              sublist.add(1);

              for (int j = 0; j < i; j++) {

                  sublist.add((int) pascal.get(i).get(j + 1) + (int) pascal.get(i).get(j));
              }

              sublist.add(1);
              pascal.add(sublist);
              System.out.println(pascal);
          }

        } else if (numrow==2) {
          pascal.add(0, List.of(1));
          pascal.add(1,List.of(1,1));
            System.out.println(pascal);
      } else if (numrow==1) {
          pascal.add(0, List.of(1));
            System.out.println(pascal);
      } else {
            System.out.println("That's an invalid row number, please enter a number greater than 0 !");
        }








    }
}
