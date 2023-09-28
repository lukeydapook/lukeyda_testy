import java.util.Scanner;

class mini1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("you opened the fridge and accidentally drank bleach instead of milk");
        System.out.println("how many gallons of bleach did you drink");

        int bleach = scan.nextInt();

        System.out.println("you drank that many gallons? this many (you should have shared) :" + bleach);

        System.out.println("to prevent dying you must drink an equal amount of paint thinner");
        int paintThinner = bleach;
        System.out.println("you drink " + bleach + " gallons of paint thinner");

        int toxicLiquidIntake = paintThinner + bleach;

        System.out.println("you have drinken " + toxicLiquidIntake + " gallons of tuxic luquid");
    }
}