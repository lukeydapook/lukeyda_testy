import java.util.Scanner;

class add
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size = 0;
        System.out.print("what size is your array ");
        size = scan.nextInt();
       

        int [] numbers = new int[size];
        
        for(int i = 0; i < size; i++)
        {
            System.out.print("give a number ");
            numbers[i] = scan.nextInt();
        }

        int total = 0;
        for(int i = 0; i < size; i ++)
        {
            int temp = numbers[i];
            total = temp + total;
        }
        System.out.println(total);
    }
}