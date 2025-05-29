/*
    Use do-while to keep taking input until the user enters "exit".
*/

import java.util.Scanner;

public class Q7 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s;
        
        do 
        { 
            System.out.println("Enter the value:");
            s = sc.nextLine();
                        
        } while(!s.equals("exit"));
          
    sc.close();
    }
    
}
