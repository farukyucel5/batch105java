package ders28;

public class string_builder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);
        //bu kod yazıldığında 7 karakterlik string builder oluşturur

        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//0

        sb.append("java");

        System.out.println(sb);

        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//4

        sb.append(" güzeldir ");


        System.out.println(sb);

        System.out.println(sb.capacity());//7*2+2
        System.out.println(sb.length());//14

        sb.append(" ona ne şüphe");

        System.out.println(sb);

        System.out.println(sb.capacity());//16*2+2
        System.out.println(sb.length());//27

        //kapasite ve uzunluğu eşitlemek istersek
        sb.trimToSize();

        System.out.println(sb);

        System.out.println(sb.capacity());//27
        System.out.println(sb.length());//27
    }
}
