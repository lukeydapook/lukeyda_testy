import java.util.Scanner;

class mini1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("how birth year you?");

        int birthYear = scan.nextInt();
        int currentYear = 2023;
        int age = currentYear - birthYear;
        System.out.println("you are " + age +" years old");

        System.out.println("you instantly die because of not the toxic things you ate");
        System.out.println("you instantly die because your always on that dang phone");

    }
}