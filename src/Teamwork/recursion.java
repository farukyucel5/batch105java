package Teamwork;

public class recursion {
    public static void main(String[] args) {

        print(0,100);

    }
    public static void print(int start,int end)
    {
        start++;
        System.out.println(start);
        if (start<end)
            print(start,end);
    }
}
