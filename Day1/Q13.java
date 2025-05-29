/*
    Inheritance (Single, Multilevel, Hierarchical, Hybrid via Interface)
    Implement a base class Person and derived class Student.
    Implement Animal -> Dog -> Puppy (multilevel).
    Use one base class and multiple subclasses (hierarchical).
    Demonstrate hybrid inheritance using interfaces.
*/

class Animal
{
    public Animal()
    {
        System.out.println("Inside the Animal constructor");
    }
}

class Dog extends Animal
{
    public Dog()
    {
        System.out.println("Inside the Dog constructor");
    }

    void Fun()
    {
        System.out.println("Inside the Fun Method");
    }
}

class Puppy extends Dog
{
    public Puppy()
    {
        System.out.println("Inside the Puppy constructor");
    }

    void Gun()
    {
        System.out.println("Inside the Gun Method");
    }
}

public class Q13
{
    public static void main(String args[])
    {
        Dog dobj1 = new Dog();
        Puppy dobj2 = new Puppy();
        dobj1.Fun();
        dobj2.Gun();   
    }    
}

///////////////////////////////////////////////////////////////////////////

class Base
{
    public Base()
    {
        System.out.println("Inside the Base constructor");
    }
}

class Derived extends Base
{
    public Derived()
    {
        System.out.println("Inside the Derived constructor");
    }
}

class DerivedX extends Base
{
    public DerivedX()
    {
        System.out.println("Inside the DerivedX constructor");
    }
}

public class Q13
{
    public static void main(String args[])
    {
        Derived dobj1 = new Derived();
        DerivedX dobj2 = new DerivedX();  
    }    
}

////////////////////////////////////////////////////////////////////////////////


interface Cat
{
    void Meow();
}

class Meowchan implements Cat
{
    public void Meow()
    {
        System.out.println("Cat sounds like meow meow");
    }
}

public class Q13
{
    public static void main(String args[])
    {
        Meowchan meow = new Meowchan();
        meow.Meow();
    }
}