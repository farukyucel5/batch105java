package Teamwork;

public class most2 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        //int[] height = {1, 2};
        //int[] height = {1, 1};
        int maksimumHacim = 0;
        for (int i = 0; i < height.length; i++)
        {
            for (int j = 1; j < height.length; j++)
            {
                int carpim = 0;
                if (height[j] <= height[i])
                {
                    if (carpim <= height[j] * (j - i))
                    {
                        carpim = height[j] * (j - i);
                        if (carpim >= maksimumHacim)
                        {
                            maksimumHacim = carpim;
                        }
                    }
                }


                else if (height[j] >= height[i])
                {
                    if (carpim <= height[i] * (j - i))
                    {
                        carpim = height[i] * (j - i);
                        if (carpim >= maksimumHacim)
                        {
                            maksimumHacim = carpim;
                        }
                    }
                }
            }
        }
        System.out.println(maksimumHacim);
    }

}
