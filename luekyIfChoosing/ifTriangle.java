import java.util.Scanner;
class ifTriangle
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("what sides?");

        System.out.println("what snide 1");
        int side1 = inputScanner.nextInt();

        System.out.println("what sid 2");
        int side2 = inputScanner.nextInt();

        System.out.println("whar last siedy");
        int side3 = inputScanner.nextInt();

        if (side1 + side2 + side3 == 180)
        {
            if ((side1 == side2) && (side2 == side3)) 
            {
                System.out.println("eenqualatrol tingale");
            }
            else if ((side1 == side2) || (side2 == side3))
            {
                System.out.println("tis incosoleez tigle");
            }
            else 
            {
                System.out.println("scalinge ttirqngle");
            }
        }
        else
        {
            System.out.println("you baffoooon");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓█▓▒░░░░░░░░░░░░░░░░░░░");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▓████▓░░░░░░░░▒▒▒▒░░░░░░░");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒░░░▓█████▓░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒░░░░░▒▓▓███▓▒░░░░░░▒▒▒▒▒▓█████▓");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▓████▓▓▓▒▒▒░░░░░░░░▒▓▓█████▓░");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▓███████▓▒▒░░░░░░░░░░░░░░░░░░░");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒░░▒░░░▒░░░▒░░░░░░░░░░░");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░▒▓█▓▓▓▓█▓▒░░░░░▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒░░░░▒▓████▓▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.println("▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓█▓█████████████████████");
            System.out.println("▓▓▓▓▓█████████████████████▓███▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.println("██████▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓████████▓▓▓▓▓");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓███████▓▓");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        }
    }
}
