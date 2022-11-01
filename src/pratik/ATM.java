package pratik;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {


        /*            Basic ATM algorithm.
       In Java, we can create an ATM program for representing ATM transection.
       In the ATM program, the user has to select an option from the options displayed on the screen.
       The options are related to withdraw the money, deposit the money, check the balance, and exit.
       withdraw the money, we simply get the withdrawal amount from the user
       and remove that amount from the total balance and print the successful message.
       To deposit the money, we simply get the deposit amount from the user, add it to the total balance
       and print the successful message.
       To check balance, we simply print the total balance of the user.       */
        double balance = 100000;

   while (true) {

       System.out.println("Withdraw the money 1: " + "\nDeposit the money 2" + "\ncheck the balance 3" +
               "\nExit 4");
       Scanner scan = new Scanner(System.in);
       int transection_type = scan.nextInt();

       switch (transection_type) {
           case 1:

               System.out.println("please enter the amount of money you'd like to take out");
               Scanner scan1 = new Scanner(System.in);
               double amount1 = scan1.nextDouble();
               balance=balance-amount1;
               System.out.println("Please collect your money: ");

               break;


           //Withdraw the money
           case 2:
               System.out.println("please enter the amount of money you'd like to deposit");
               Scanner scan2 = new Scanner(System.in);
               double amount2 = scan2.nextDouble();
               balance=balance+amount2;
               System.out.println("successfully deposited! ");

               break;



           //Deposit the money
           case 3:
               //check the balance
               System.out.println("your current ballance:  "+balance);
               break;


           case 4:
               //exit
               System.exit(0);//programı sonlandıran özel method.
               break;

           default:
               System.out.println("PLEASE PASS IN A NUMBER BETWEEN 1 AND 4");
       }

   }

 }
}
