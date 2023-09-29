import java.util.Scanner;

class mini5
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("you have spent too much money on your food/drinks");
        System.out.println("you cant stop now");
        System.out.println("you take out a loan for how much");

        double loan = scan.nextInt();

        System.out.println("you need $" + loan + " , said bank guy");

        System.out.println("yarp, said you");
        double intrest = 1.05;
        System.out.println("you need " + loan + " interest is 5%");

        System.out.print("you need pay back ");
        System.out.println(loan * intrest);
    }
}