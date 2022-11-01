package ders14;

public class method3 {
    public static void main(String[] args) {

        String str="almost there";
        System.out.println(inverse(str));

    }

    public static String inverse(String a)
    {
        String TERS="";
        for (int i = a.length()-1; i >=0 ; i--) {

            TERS=TERS + a.charAt(i);
        }

        return TERS;

    }
}
