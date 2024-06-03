// Rock Paper and Scissor

import java.util.Scanner;
import java.util.Random;
public class Game
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int cpoint = 0;
        int point = 0;

        System.out.printf("\nLets play Rock, Paper and Scissors\n");
        System.out.printf("Between me & you\n");

        System.out.printf("------------------------------------------------");
        System.out.printf("\n1. Rock\n2. Paper\n3. Scissors\n");
        System.out.printf("------------------------------------------------");

        while(cpoint != 3 || point != 3)
        {
            System.out.printf("\nChoose your input: ");
            int player = s.nextInt();

            if (player > 0 && player < 4)
            {
                int computer = r.nextInt(1, 3);

                if (player == computer)
                {
                    System.out.printf("Computer's choice was %d\n", computer);
                    System.out.printf("Its a tie Between you and me.\n");
                }

                else if (player == 1 && computer == 2)
                {
                    System.out.printf("Computer Won .\n");
                    System.out.printf("Computer's choice was %d\n", computer);
                    ++cpoint;
                }

                else if (player == 2 && computer == 3)
                {
                    System.out.printf("Computer's choice was %d\n", computer);
                    System.out.printf("Computer Won .\n");
                    ++cpoint;
                }

                else if (player == 3 && computer == 1)
                {
                    System.out.printf("Computer's choice was %d\n", computer);
                    System.out.printf("Computer Won .\n");
                    ++cpoint;
                }

                else
                {
                    System.out.printf("Player Won .\n");
                    System.out.printf("Computer's choice was %d\n", computer);
                    ++point;
                }
            }
            break;
        }

        if (cpoint > point)
            System.out.printf("Computer Won the Game");

        else
            System.out.printf("Player Won the Game");
    }
}