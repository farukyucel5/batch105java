package ders27;

public class String_pool {
    public static void main(String[] args) {

        String str1="java";
        String str2="java";
        String str3=new String("java");

        String str4="";

         str4="java";

         String str5="ja";
         str5=str5.concat("va");

        System.out.println(str1.equals(str2));//true
        System.out.println(str1==str2);//true

        System.out.println(str4.equals(str5));//true
        System.out.println(str4==str5);//false

        /*
        == in doğru sonuş vermesi için hem referans hem de değerin aynı olması lazım
        fakat equals da sadece değerlerin aynı olması yeterli true sonuç vermesi için.
         */

    }
}
