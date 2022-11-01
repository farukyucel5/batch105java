package ders25;

public class Ahemsire_runner {
    public static void main(String[] args) {
        Ahemire h1=new Ahemire();
        h1.personelısmi="Ayse";
        h1.personeladresi="Ulus";
        h1.personeltelefonu="093767878787";
        System.out.println(h1);

        Ahemire h2=new Ahemire();
        System.out.println(h2);

        h2.personeltelefonu="08654331";
        h2.personeladresi="sincan";
        h2.personelısmi="hatice";
        h2.bashekim="yasar kemal";//static değişkenlere doğrudan sınıf aracılığı ile ulaşılır yani direkt sınıfa
        //bağlıdır.
        //Ahemire.bashekim


        System.out.println(h2);
        System.out.println(h1);


        //static bir variable 'a atama yaptigimiz andan itibaren butun objelerin
        // ilgili degeri degisir  (bashekimIsmi    Yasar Kemal'dir) ama instantlar öyle değil.

    }

}
