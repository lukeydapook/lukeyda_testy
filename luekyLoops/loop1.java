import java.util.Scanner;

class loop1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("muber choose i will factorial");
        int number = scan.nextInt();
        System.out.println("your nunmber is " + number);
        int finalNum = 1;

        for(; number > 0; number--)
        {
            finalNum *= number;
        }
        System.out.println("final answer is " + finalNum);

    }
}