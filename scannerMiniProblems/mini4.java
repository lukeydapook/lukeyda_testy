import java.util.Scanner;

class mini4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("wat farenheirt");

        double fahrenheit = scan.nextInt();

        double celcius = (fahrenheit - 32) * 5/9;


        System.out.println("celcus is");
        System.out.println(celcius);
    }
}