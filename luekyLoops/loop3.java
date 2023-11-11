class loop3
{
    public static void main(String args[])
    {
        System.out.println("we countdown from 💯");
        System.out.println("but only evens");
        int number = 100;
        for(number = 100; number >= 0; number--)
        {
            System.out.println(number);
            number = number - 1;
        }
    }
}