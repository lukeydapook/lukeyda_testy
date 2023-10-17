import java.util.Scanner;

class if5
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("chooste yeer");
        int year = scan.nextInt();
        System.out.println("your yeere is " + year);

        if(year % 4 == 0)
        {
            System.out.println("your yerfn got hops/leaps");
        }
        else
        {
            System.out.println("year cant jump or leaeps");
        }
    }
}