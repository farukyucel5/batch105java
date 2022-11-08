package ders29;

public class string_builder_access_modifier {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("java candır");

        System.out.println(sb1.reverse());//rıdnac avaj

        System.out.println(sb1);//rıdnac avaj

        //stringbuiderler mutubable'dır

        System.out.println(sb1.insert(0, "."));//.rıdnac avaj

        System.out.println(sb1);//.rıdnac avaj

        sb1.reverse();

        StringBuilder sb2=new StringBuilder("java candır");
        String str="java candır";

        System.out.println(sb1==sb2);//false

        //System.out.println(sb1==str);hata verir data türleri farklı.

        System.out.println(sb1.equals(sb2));//false içerik aynı olsa bile false verir.
        System.out.println(sb1.equals(str));//false cte vermez ama sonuç herzaman false dur.
        StringBuilder sb3=new StringBuilder("java kandır");
        System.out.println(sb1.compareTo(sb3));
        System.out.println(sb1.compareTo(sb2));


        StringBuilder sb=new StringBuilder(5+7+"java"+4+5);
        String isim="Mesut";
        sb.append(isim,2,4);
        sb.delete(4,6);
        System.out.println(sb);

        StringBuilder sb4=new StringBuilder("OCAJP8");
        sb4.subSequence(2,4);
        sb4.deleteCharAt(3);
        sb4.reverse();
        System.out.println(sb4);





    }
}
