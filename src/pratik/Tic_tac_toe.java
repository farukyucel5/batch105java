package pratik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tic_tac_toe {

static ArrayList<Integer> player1check=new ArrayList<>();
static ArrayList<Integer> player2check=new ArrayList<>();

    public static void main(String[] args) {

        /*

(Oyun: Tic-tac-toe) Tic-tac-toe oyununda iki oyuncu sırasıyla 3*3 bir tabloda boş olan bir kareye X ya da O taşını
koyar. Eğer bir oyuncu aynı satıra, aynı sütuna ya da çapraz olarak üç taş koyduysa oyun biter ve bu oyuncu kazanır
. Tablodaki tüm alanlar doldurulursa ve bir oyuncu kazanmış durumda değilse oyun sonlanır ve bu oyun berabere biter
. Tic-tac-toe oynatan bir program yazınız.

 Program iki oyuncudan da X taşını ve O taşını tabloda bir yere koymasını istesin. Oyuncu oynadıktan sonra program
tablonun durumunu göstersin ve oyunun durumuna karar versin (Kazandınız, berabere, devam edin).

         */
        char[][] game_b={{' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}};




       while (true)
       {
           char player1='x';
           char player2='o';

           Scanner scan=new Scanner(System.in);

           System.out.println("This is the first player's turn\nenter a placement: ");
           int placement=scan.nextInt();


           placing(game_b,placement,player1);
           gameboard(game_b);


           System.out.println("This is the second player's turn\nenter a placement: ");
           placement=scan.nextInt();

           placing(game_b,placement,player2);
           gameboard(game_b);



           playercheck();

       }


    }

    private static void playercheck()
    {
        List<Integer> toprow=Arrays.asList(1,2,3);
        List<Integer> midrow=Arrays.asList(4,5,6);
        List<Integer> botrow=Arrays.asList(7,8,9);
        List<Integer> leftcol=Arrays.asList(1,4,7);
        List<Integer> midcol=Arrays.asList(2,5,8);
        List<Integer> rightcol=Arrays.asList(3,6,9);
        List<Integer> cross1=Arrays.asList(1,5,9);
        List<Integer> cross2=Arrays.asList(7,5,3);

        List<List> winning=new ArrayList<>();
        winning.add(toprow);
        winning.add(midrow);
        winning.add(botrow);
        winning.add(leftcol);
        winning.add(midcol);
        winning.add(rightcol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l:winning)
        {
            if (player1check.containsAll(l))
            {
                System.out.println("player1 won!");

            }
            else if (player2check.containsAll(l))
            {
                System.out.println("player2 won");
            }
            else if (player1check.size()+player2check.size()==9)
            {
                System.out.println("Tied!!");
            }

        }



    }


    private static void placing(char[][] g_board,int placement,char player)
    {
        if (player=='x')
        {
            player1check.add(placement);
        }
        else if (player=='o')
        {
            player2check.add(placement);

        }

        switch (placement)
        {
            case 1:
                g_board[0][0]=player;
                break;

            case 2:
                g_board[0][2]=player;
                break;


            case 3:
                g_board[0][4]=player;
                break;


            case 4:
                g_board[2][0]=player;
                break;

            case 5:
                g_board[2][2]=player;
                break;

            case 6:
                g_board[2][4]=player;
                break;

            case 7:
                g_board[4][0]=player;
                break;
            case 8:
                g_board[4][2]=player;
                break;
            case 9:
                g_board[4][4]=player;
                break;

            default:
                System.out.println("please enter a number between 1 and 9");
                break;
        }


    }


    public static void gameboard(char[][] g_board)

    {


        for (char[] each:g_board)
        {
            for (char eachone:each)
            {
                System.out.print(eachone);

            }
            System.out.println();


        }

    }
}
