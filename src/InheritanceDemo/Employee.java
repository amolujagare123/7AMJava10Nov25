package InheritanceDemo;

public class Employee  {

    String name;
    int salary = 25000;

    void empWork()
    {
        System.out.println("empWork");
    }

}

class Programmer extends Employee
{
    int bonus = 45000;

    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "amol";
        System.out.println(e.salary);
        e.empWork();

        Programmer p = new Programmer();
        p.name = "";
        System.out.println(p.salary);
        p.empWork();
    }
}
