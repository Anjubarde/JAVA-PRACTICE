/*
    Encapsulation
    Create a class Employee with private fields. Use getters and setters to access them.
*/

class Employee
{
    private int i;
    private float f;

    public Employee(int i)
    {
        this.i = i;
    }

    public int getI()
    {
        return i;
    }

    public void Display()
    {
        System.out.println("Integer i: "+ i);
    }
}
class Q15
{
    public static void main(String ags[])
    {
        Employee emplyo = new Employee(101);
        emplyo.Display();
    }
}