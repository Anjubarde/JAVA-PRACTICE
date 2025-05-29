/*
Create a pattern like:
 1
 1 2
 1 2 3
 1 2 3 4
*/


public class Q6 
{
    public static void main(String args[])
    {
        int i = 0, j = 0;
        int iRow  = 4, iCol = 4;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j || i > j)
                {
                    System.out.println(j+"\t");
                }
                else
                {
                    System.out.println("\t");
                }
            }
            System.out.println("\t");
        }
    }    
}
