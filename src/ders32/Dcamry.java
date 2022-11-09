package ders32;

public class Dcamry extends Btoyoya {

    Dcamry(String pc)
    {
        super("deniz");
        System.out.println("string parametreli cambry");
    }

    Dcamry()
    {

    }



    public static void main(String[] args) {
      //eğer kullanılan argumente uygun bir constructor parent classta yoksa cte olur.

        Dcamry cambry2=new Dcamry("celal");

        System.out.println("==================");
        Dcamry cambry=new Dcamry();
    }
}
