import java.util.Scanner;

class if3
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("what gade?");
        int grade = scan.nextInt();
        System.out.println("your are have " + grade);

        if(grade < 59)
        {
            System.out.println("you FFFail😭😭");
        }
        else if((grade < 70) && (grade > 59))
        {
            System.out.println("you DDDDisgust me😱😱");
        }
        else if((grade < 80) && (grade > 69))
        {
            System.out.println("your a CCCouch-potato🛋️🥔");
        }
        else if((grade < 90) && (grade > 79))
        {
            System.out.println("get BBBetter");
        }
        else if((grade < 101) && (grade > 89))
        {
            System.out.println("good AAAmazing");
        }
    }
}