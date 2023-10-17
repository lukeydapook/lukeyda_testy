import java.util.Scanner;

class if1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("muber choose if even or not");
        int number = scan.nextInt();
        System.out.println("your nunmber is " + number);

        if(number % 2 < 1)
        {
            System.out.println("your nunmber is evein");
        }
        else
        {
            System.out.println("your nunmber is oddd");
        }
    }
}