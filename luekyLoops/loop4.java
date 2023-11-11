import java.util.Scanner;
import java.util.Random;

class loop4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("price is right game price will be below 500");

        Random compNum = new Random();
        int num = compNum.nextInt(501);

        int userGuess = scan.nextInt();

        int atempt = 0;


        while(userGuess != num)
        {

            if(userGuess < num)
            {
                System.out.println("l bozo too low, i do not accept lowballs");
            }
            if(userGuess > num)
            {
                System.out.println("your too high");
            }

            atempt++;

            System.out.println("oh my gyeaat bro please get better guess again");
            userGuess = scan.nextInt();
        }

    }
}