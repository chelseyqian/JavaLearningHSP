package Chapter10;

public class AbstractExercise {
    public static void main(String[] args) {
        Manager manager = new Manager("Jack", 5000, 0);
        manager.work();
    }
}

abstract class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("经理" + getName() + "正在工作");
    }
}
