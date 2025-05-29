/*
    Write a Java program to declare all primitive data types and display their default 
    values.
*/
import java.util.Scanner;

class Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i = 10;
        System.out.println(i);

        float f = 1.1f;
        System.out.println(f);

        char ch = 'M';
        System.out.println(ch);

        double d = 2.3435f;
        System.out.println(d);

        boolean b = true;
        System.out.println(b); 

        long l = 233455;
        System.out.println(l);

        short s = 123;
        System.out.println(s);

        System.out.println("Enter the value :");
        int iInt = sc.nextInt();
        System.out.println("The integer value is :"+iInt);

        sc.close();
        
    }
}