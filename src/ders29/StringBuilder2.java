package ders29;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java ne kadar guzel");

        System.out.println(sb.substring(4));//ne kadar güzel

        System.out.println(sb);//java ne kadar güzel

        //sb=sb.substring(0,4); eşitliğin solu string builder sağı ise string olduğundan olmaz
        //java non-primitive data türlerini birbirine cast etmez.

        /*
        String buider da olmayan ,string de bulunan methotları kullanmak isterseniz
        önce toString ile stringe çevirip sonra kullanabiliriz
         */

        System.out.println(sb.toString().contains("guzel"));

        sb.setCharAt(5,'N');
        System.out.println(sb);

    }
}
