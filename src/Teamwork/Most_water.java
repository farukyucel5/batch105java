package Teamwork;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Most_water
{
    /*
You are given an integer array height of length n.
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
     */

    public static void main(String[] args) {

        int[] height={1,8,6,2,5,4,8,3,7};

        List<List> top_point=new ArrayList<>();
        List<List> bottom_point=new ArrayList<>();

        for (int i = 0; i <height.length; i++)
        {
            bottom_point.add(Arrays.asList(i,0));//This is the list keeping the bottom points of the lines

        }
        System.out.println(bottom_point);

        for (int i = 0; i < height.length; i++)
        {

           top_point.add(Arrays.asList(i,height[i]));
        }

        System.out.println(top_point);


        List<Integer> areas=new ArrayList<>();


        for (int i = 0; i <height.length; i++)
        {
            int container_height=0;
            int length_of_container;

            for (int j = i+1; j < height.length; j++)
            {
                int y_axis1=(int)top_point.get(i).get(1);
                int x_axis1=(int)bottom_point.get(i).get(0);

                int y_axis2=(int)top_point.get(j).get(1);
                int x_axis2=(int)bottom_point.get(j).get(0);

                container_height = Math.min(y_axis1, y_axis2);//The minimun y axis value is to be returned.

                length_of_container=x_axis2-x_axis1;

                int area_of_container=length_of_container*container_height;

                if (!areas.contains(area_of_container))
                {
                    areas.add(area_of_container);
                }

            }
        }
        Collections.sort(areas);

        int most_water_container=areas.get(areas.size()-1);

        System.out.println("The cross-sectional area of the container to be with the most water:  "
                +most_water_container);
    }
}
