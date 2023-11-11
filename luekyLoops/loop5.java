import java.util.Scanner;

class loop4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("do you want how many");
        int numOfNum = scan.nextInt();

        int big = 0;
        int small = 0;

        while(numOfNum > 0)
        {
            System.out.println("coose anomber " + numOfNum + ": left");
            int number = scan.nextInt();

            numOfNum--;

            if(big < number)
            {
                big = number;
            }
            if(small > number)
            {
                small = number;
            }
        }
        System.out.println("your bigesd was " + big);
        System.out.println("your smallest was " + small);
    }
}