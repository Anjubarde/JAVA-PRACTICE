/*
    Convert an integer to float, and a double to int. Print the values before 
    and after conversion.
*/

public class Q2 {
    public static void main(String args[]) {
        int i = 0;
        System.out.println(i);

        float f = 2.3f;
        System.out.println(f);

        double d = 3.445f;
        System.out.println(d);

        //Convert int into float
        float f2 = 4.5f;
        int k;
        k = (int)f2;
        System.out.println(k);

        //Convert float into int
        int h = 44;
        float l;
        l = (float)h;
        System.out.println(l);

        //Convert double into int
        double s = 3.456767f;
        int t;
        t = (int)s;
        System.out.println(t);
    }
}
