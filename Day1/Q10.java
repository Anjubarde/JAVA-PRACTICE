/*
    Use this keyword to resolve ambiguity in constructor.
 */

public class Q10 
{

        String name;
        int age;

    
        Q10(String name, int age) 
        {
            this.name = name;  
            this.age = age;    
        }

        void display() 
        {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public static void main(String[] args) 
        {
            Q10 s1 = new Q10("Mayur", 22);
            s1.display();  
        }
}  

