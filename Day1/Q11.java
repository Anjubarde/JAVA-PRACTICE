/*
    Show super being used to call a parent constructor and method.
*/

// Parent class
class Meow 
{
    String name;

    Meow(String name) 
    {
        this.name = name;
        System.out.println("Inside the Meow Constructor " + name);
    }

    void speak() 
    {
        System.out.println(name + " Inside the Meow voice");
    }
}

// Child Class
class Cat extends Meow 
{

    Cat(String name) 
    {
        super(name); 
        System.out.println("Inside the cat constructor " + name);
    }

    @Override
    void speak() 
    {
        super.speak();  
        System.out.println(name + " MeowMeow");
    }
}

public class Q11 
{
    public static void main(String[] args) {
        Cat cat = new Cat("Meowchan");
        cat.speak();
    }
}
