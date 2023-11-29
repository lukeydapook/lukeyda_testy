import java.util.Scanner;

public class instance 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to cake store what flavor would you likke");
        String userCake = scanner.next();

        System.out.println("this is odd but choose one letter from it");
        System.out.println("we gonna find how many times that letter happens");
        String letter = scanner.next();

        int amountRepeated = 0;
        for (int i = 0; i < userCake.length(); i++) 
        {
            if (userCake.charAt(i) == letter.charAt(0)) 
            {
                amountRepeated++;
            }
        }

        if(amountRepeated > 0) 
        {
            System.out.println(letter + " is there " + amountRepeated + " times in " + userCake + ", congrats bobo");
        } 
    }
}