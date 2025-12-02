package InheritanceDemo.SuperDemo;

public class Employee  {

    String name;
    int salary = 25000;

    void empWork()
    {
        System.out.println("empWork");
    }
    Employee()
    {
        System.out.println("Employee Constructor");
    }

    Employee(String name)
    {
        System.out.println("name="+name);
        System.out.println("Employee Constructor");
    }


    void work()
    {
        System.out.println("employee Work");
    }

}

class Programmer extends Employee
{
    int bonus = 45000;
    int salary = 55000;


    void work()
    {
        System.out.println("programmer Work");
    }

    Programmer()
    {
        super("Text");
        System.out.println("Programmer Constructor");
    }

    void programmerWork()
    {

        System.out.println("programmerWork");
    }

    void display()
    {
        System.out.println("salary="+salary);
        System.out.println("salary="+super.salary);
        work();
        super.work();
    }

    public static void main(String[] args) {

         Employee e = new Programmer();
         e.work(); // calling the overridden method

    }
}
