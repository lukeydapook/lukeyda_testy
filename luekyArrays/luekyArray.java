import java.util.Scanner;

class luekyArray
{
    public static void main(String args[])
    {
        String [] name = new String[20];

        Scanner scan = new Scanner(System.in);

        boolean stopper = false;
        int index = 0;

        while(stopper != true)
        {
            System.out.print("helo please enter a name if you wanna leave say exit   ");

            String replace = scan.nextLine();

            if(replace.equals("exit"))
            {
                stopper = true;
            }
            else
            {
                name[index] = replace;
                index++;
            }

            if(index > 19)
            {
                System.out.println("bozo only 20 pleas");
                stopper = true;
            }
        }

        index = 0;

        while(name[index] != null)
        {
            System.out.print(name[index] + " ");
            index++;
        }
    }
}