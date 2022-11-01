package Teamwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class most_water2 {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int length=height.length;

        int[][] top_points=new int[length][2];
        int[][] bottom_points= new int[length][2];

        for (int i = 0; i <length; i++)
        {
            top_points[i]= new int[]{i,height[i]};
        }

        System.out.println(Arrays.deepToString(top_points));

        for (int i = 0; i < length; i++)
        {
            bottom_points[i]=new int[]{i,0};
        }

        System.out.println(Arrays.deepToString(bottom_points));

        List<Integer> areas=new ArrayList<>();

        for (int i = 0; i < length; i++) {
            int container_height = 0;
            int length_of_container;

            for (int j = i + 1; j < length; j++) {
                int y_axis1 = top_points[i][1];
                int x_axis1 = bottom_points[i][0];

                int y_axis2 = top_points[j][1];
                int x_axis2 = bottom_points[j][0];

                container_height = Math.min(y_axis1, y_axis2);//The minimun y axis value is to be returned.

                length_of_container = x_axis2 - x_axis1;

                int area_of_container = length_of_container * container_height;

                if (!areas.contains(area_of_container)) {
                    areas.add(area_of_container);
                }
            }
        }
        Collections.sort(areas);

        int The_max_area=areas.get(areas.size()-1);
        System.out.println("The area of the container with the most water: "+The_max_area);

    }
}
