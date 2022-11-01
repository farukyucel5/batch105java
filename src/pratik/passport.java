package pratik;

public class passport {

    public static void main(String[] args) {

        //kullanicinin girdigi sifrenin son indexinde ozel karakter varsa true yoksa false yazdirin
        String sifre = "jhbjhbjaj?";

        sifrele(sifre);
    }

    public static void sifrele(String a)
    {//method olusturdum
        String ozel = "!@#$%^&*()_+,./';[]<>?:";//sonra ozel karakterlerin yer aldigi bir string olusturdum
        char sonuc = a.charAt(a.length() - 1); //stringin son karakterini sonuc variableina atadim
        char s='0';
        for (int i = 0; i < ozel.length()-1; i++) { //ozel karakterleri birer birer sonuc icerinde arattim

            s=ozel.charAt(i);
            if (sonuc==s)
            {
                System.out.println("true"); //son karakterde varsa true

            }


        }

        if (sonuc!=s)
        {
            System.out.println("false ");

        }

        System.out.println(a);//

    }
}
