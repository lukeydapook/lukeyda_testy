import java.util.Scanner;

class if4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("chooste captal letter");
        char letter = scan.next().charAt(0);
        System.out.println("your letters is " + letter);

        if((letter == 65) || (letter == 69) || (letter == 73) || (letter == 79) || (letter == 85))
        {
            System.out.println("your letter vowerl");
        }
        else
        {
            System.out.println("your letter consatnot");
        }
    }
}