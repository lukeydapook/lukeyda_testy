import java.util.Scanner;

class luekyDuplicate
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        String [] itemsOrdered = new String[25];

        boolean stopper = false;
        int index = 0;
        
        System.out.println("welcome to mcdonalds how can i help you today. if your order has over 25 items you have to call ahead");

        while(stopper != true)
        {
            System.out.println("if that is all just say: finished");
            String order = scanner.next();

            if(order.equals("finished"))
            {
                stopper = true;
            }
            else
            {
                itemsOrdered[index] = order;
                index++;
            }
        
        }

        index = 0;

        String dupeName = "";
        boolean dupedBozo = false;

        for (int i = 0; i < 25; i++) 
        {
            for (int j = i + 1; j < 25 && itemsOrdered[j]!=null; j++) 
            {
                //System.out.print("I am in the looooooop");
                if(itemsOrdered[i].equals(itemsOrdered[j])) 
                {
                    dupedBozo = true;
                    dupeName = itemsOrdered[i];
                }
            }
        }

        if(dupedBozo == true) 
        {
            System.out.println("you wanted multiple " + dupeName + "es, so i added them together on your recipt");
        } 
        else 
        {
            System.out.println("have a nice day (you had no duplicates)");
        }
    }  
}