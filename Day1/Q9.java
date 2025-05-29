

/*
    Demonstrate static variable and method in a class.
*/

public class Q9 
{
   static void Display()
   {
        int i = 12;
        final class Counter
        {
            static int j = 12;
        }

        i++;
        Counter.j++;

        System.out.println(i);
        System.out.println(Counter.j);
   }

   public static void main(String args[])
   {
        Display();
        Display();
        Display();
        Display();
        Display();
   }
}
