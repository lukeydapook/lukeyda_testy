import java.util.Scanner;

class loop2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a name");
        String name = scan.nextLine();
        System.out.print("your name is ");

        for( int num = name.length() - 1; num > -1; num--)
        {
            System.out.print(name.charAt(num));
        }


    }
}