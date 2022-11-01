package ders14;

public class asalmı {

    public static void main(String[] args) {


       asal(34);

    }

    public static void asal(int integer)
    {


        int bayrak=0;

        for(int i=2;i<=integer-1;i++)
        {
            if(integer % i == 0)
            {
                bayrak++;
                break;
            }

        }


        if (bayrak==0)
            System.out.println("ASALDIR");
        else
            System.out.println("asal değidir");


    }
}
