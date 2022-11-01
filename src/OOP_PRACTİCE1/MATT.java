package OOP_PRACTİCE1;

import java.util.ArrayList;
import java.util.List;

public class MATT
{
     int num1;
     int num2;

    List<Integer> common_divisor;



    public MATT(int num1, int num2)
    {
        this.num1=num1;
        this.num2=num2;
        this.common_divisor =common_factor(this.num1,this.num2);


    }


    public static void main(String[] args)
    {

    }

    public static List<Integer> common_factor(int num1, int num2)
    {
      List<Integer> common_factor_of_nums=new ArrayList<>();

        if (num1<num2)
        {
            for (int i = 1; i < num1; i++)
            {
                if (num1%i==0 && num2%i==0)
                {
                    common_factor_of_nums.add(i);
                }

            }
        }

        if (num2<num1)
        {
            for (int i = 1; i < num2; i++)
            {
                if (num1%i==0 && num2%i==0)
                {
                    common_factor_of_nums.add(i);
                }

            }
        }


        return common_factor_of_nums;
        
    }

    @Override
    public String toString() {
        return "MATT{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", common_divisor=" + common_divisor +
                '}';
    }
}