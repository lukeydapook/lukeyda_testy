import java.util.Scanner;

class luekyFirstScanner
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("empty the compartments of your pantaloons");
        System.out.println("how much money in you pockets");

        int money = scan.nextInt();

        System.out.println("you have this much monner :$" + money);

        System.out.print("im gonna take half :$");
        System.out.println(money / 2);
        money = money /= 2;


        System.out.print("i invested it and you quadriplendfin (4) your moner :$");
        System.out.println(money * 4);
        money = money *= 4;

        System.out.print("too bad i invested in gamestop 🥺 :$");
        System.out.println(money - 95615879);
        money = money -= 95615879;
    }
}