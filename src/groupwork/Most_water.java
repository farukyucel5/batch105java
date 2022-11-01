package groupwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Most_water {
    public static void main(String[] args) {
        /*
You are given an integer array height of length n.
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
         */

        int[] heigth={1,8,6,2,5,4,8,3,7};


     int[][] top_points=new int[heigth.length][2];
     int[][] bottom_point=new  int[heigth.length][2];

        for (int i = 0; i < heigth.length; i++)
        {
            top_points[i]=new int[]{i,heigth[i]};

        }

        System.out.println(Arrays.deepToString(top_points));

        for (int i = 0; i < heigth.length; i++)
        {
            bottom_point[i]=new int[]{i,0};

        }

        System.out.println(Arrays.deepToString(bottom_point));

        List<Integer> alanlar=new ArrayList<>();

        for (int i = 0; i < heigth.length; i++)
        {
            int cont_height=0;
            int length=0;

            for (int j =i+1; j < heigth.length ; j++)
            {
                int y_axis1=top_points[i][1];
                int x_axis1=bottom_point[i][0];

                int y_axis2=top_points[j][1];
                int x_axis2= top_points[j][0];

                cont_height = Math.min(y_axis1, y_axis2);

               length=x_axis2-x_axis1;

               int area=cont_height*length;

               if (!alanlar.contains(area))
               {
                   alanlar.add(area);
               }



            }

        }

        System.out.println(alanlar);

        Collections.sort(alanlar);

        System.out.println(alanlar);

        System.out.println("en büyük alana sahip kabın alanı: "+ alanlar.get(alanlar.size()-1));




    }
}
