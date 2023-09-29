import java.util.Scanner;

class mini7
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("you are fleeing the country for commiting tax fraud");
        System.out.println("you gotta convert all your money into CAD");
        System.out.println("how much money do you have");

        int american = scan.nextInt();
        double conversion = 1.35;
        double canadian = american * conversion;

        System.out.println("you go to convert your USD to CAD and get $" + canadian + " CAD");

        System.out.println("unfortunately, as you cross the border the cops shoot you on sight and you die");
        System.out.println("");

        System.out.println("but... because of the toxic delectables you have in your bloodstream");
        System.out.println("you dont die and you projectile vomit onto the cops and they instantly dissolve");


    }
}