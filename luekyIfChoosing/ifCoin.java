import java.util.Random;

class ifCoin
{
    public static void main(String args[])
    {
        Random random = new Random();

        int hOrT = random.nextInt(2);

        if(hOrT == 0)
        {
            System.out.print("hedz🥺🥺🤨😭🤪😜");
        }
        else
        {
            System.out.print("taylz🐕🐕🐈🐈🐈‍⬛🐈‍⬛");
        }

    }
}