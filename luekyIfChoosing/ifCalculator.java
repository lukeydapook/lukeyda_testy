import java.util.Scanner;

class ifCalculator
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("chooste operation (*,+,-, or /)");
        String operation = scan.nextLine();
        System.out.println("operaton is " + operation);

        System.out.println("chooote a numbor");
        int num1 = scan.nextInt();

        System.out.println("chooote a numbor againg");
        int num2 = scan.nextInt();
        

        if(operation.equals("*"))
        {
            System.out.println(num1 * num2);
        }
        else if(operation.equals ("+"))
        {
            System.out.println(num1 + num2);
        }
        else if(operation.equals("-"))
        {
            System.out.println(num1 - num2);
        }
        else if(operation.equals("/"))
        {
            System.out.println(num1 / num2);
        }
        else
        {
            System.out.println("you bafoon🤪🤪😜😜😱😱😱😭😭🥺🤨");
        }

    }
}