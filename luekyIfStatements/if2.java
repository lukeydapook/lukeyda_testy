import java.util.Scanner;

class if2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("age? plea enter no nengative age");
        int age = scan.nextInt();
        System.out.println("your are " + age);

        if(age < 0)
        {
            System.out.println("you aint even born🤨");
        }
        else if((age < 4) && (age > 0))
        {
            System.out.println("your a literal infant how are you on github?? wait your probably eldon");
        }
        else if((age < 21) && (age > 12))
        {
            System.out.println("your literally not luke");
        }
        else if((age < 13) && (age > 4))
        {
            System.out.println("your litteraly me");
        }
        else if((age < 65) && (age > 21))
        {
            System.out.println("adult and beeirr🤪🤪");
        }
        else if(age > 65)
        {
            System.out.println("mainnn you old as walters laptop💀💀");
        }
    }
}