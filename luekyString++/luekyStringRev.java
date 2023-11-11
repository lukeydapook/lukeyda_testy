import java.util.Scanner;

class luekyStringRev
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("what be thous nameith");
        String name = scan.nextLine();

        int nameLen = name.length();

        //int pleaseStart = 1;

        String finalString = "";
        
        int starter = 0;

        for(starter = nameLen-1; starter > -1; starter--)
        {
            starter += name.charAt(finalName);
            System.out.println(finalName);
        }
        System.out.println(finalString);

        for(starter = nameLen-2; starter > -1; starter--)
        {

            finalString += name.charAt(finalName);
            System.out.println(finalName);
        }
        System.out.println(finalString);
    }
}
