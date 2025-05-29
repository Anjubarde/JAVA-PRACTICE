/*
    Create a final class and method — try to override it in subclass and see what happens.

*/

class Base
{
    final public void Fun()
    {
        System.out.println("Inside the Fun");
    }
    public void Gun()
    {
        System.out.println("inside the Gun");
    }
}

class Derived extends Base
{
    public void Fun()      // Error 
    {
        System.out.println("Inside the Fun");   
    }
    public void Gun()
    {
        System.out.println("Inside the Gun");
    }
}

public class Q12 
{
    public static void main(String args[])
    {
        Base base = new Base();
        Derived derived = new Derived();
    }    
}
