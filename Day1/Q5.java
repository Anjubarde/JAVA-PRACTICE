/* 
    Print Fibonacci series using a loop.
*/

import java.util.Scanner;

public class Q5
{
    public static void Fibonacci(int n)
    {
        int a = 0, b = 1;

        for(int i = 0; i < n; i++)
        {
            System.out.println(a + " ");
            int z = a + b;
            a = b;
            b = z;
        }
        System.out.println();
    }
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int value = sc.nextInt();

        Fibonacci(value);

        sc.close();
    }
}
