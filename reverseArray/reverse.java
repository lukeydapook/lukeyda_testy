import java.util.Scanner;

class reverse
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("welcom to denny's how many items are on your order?");
        int size = scan.nextInt();

        int[] array = new int[size];

        int current = 0;
        for (int i = 0; i < size; i++)
        {
            System.out.print("ok you wamnt a number: ");
            array[i] = scan.nextInt();

            System.out.println("");
        }

        for (int i = 0, j = size - 1; i < size / 2; i++, j--)
        {
            current = array[j];
            array[j] = array[i];
            array[i] = current;
        }

        System.out.print("so backwards your order is ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("this is why i dont go to denny's anymore");
    }
}