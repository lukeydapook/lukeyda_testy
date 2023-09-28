import java.util.Scanner;

class mini4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("along with your toxic delight, you need something solid");
        System.out.println("you eat battery acid, how much did you eat");

        int batteryAcid = scan.nextInt();

        System.out.println("you ate " + batteryAcid + " servings of battery acid");

        System.out.println("you need MORE");
        int seconds = batteryAcid * 2;
        System.out.println("you eated " + seconds + " total servings of battery acid");
    }
}