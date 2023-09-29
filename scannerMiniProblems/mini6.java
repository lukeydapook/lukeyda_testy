import java.util.Scanner;

class mini6
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("you are filling a suprisingly circular room with mercury");
        System.out.println("you need to figure out how much you need");
        System.out.println("how big is the room");

        int radius = scan.nextInt();
        double pi = 3.14159;
        double area = (radius * radius) * pi;

        System.out.println("you have 0 intrest in math so you call up Ľûķę to do it for you");

        System.out.print("Ľûķę says the room is ");
        System.out.println(area + " big");

    }
}