/*
    Use break and continue in a loop to skip even numbers.
*/

public class Q8 
{
    public static void main(String arg[])
    {
        for(int i = 0; i <= 10; i++)
        {
            if(i % 2 == 0)
            {
                continue;
            }
            System.out.println(i);

            if(i == 9)
            {
                break;
            }
        }
        
    }    
}
