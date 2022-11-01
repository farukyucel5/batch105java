package pratik;

import java.util.Scanner;

public class square_number_for {
    public static void main(String[] args) {

       /* Kullanicidan bir pozitif tam sayi isteyin,
        sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int number = scan.nextInt();
        int kontrol = 1;

        for (int i = 0; i <= number; i++) {
            kontrol = i * i;
            if (kontrol == number) {
                System.out.println(true);
                break;
            }

        }


        if (kontrol != number) {
            System.out.println(false);
        }
    }
}
