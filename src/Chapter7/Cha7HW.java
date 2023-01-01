package Chapter7;//第七章面向对象作业

public class Cha7HW {
    public static void main(String[] args) {

        //1.
        Book b = new Book(176);
        b.updatePrice();
        System.out.println(b.getPrice());

        //2.
        Circle c = new Circle();
        GetArea a = new GetArea();
        a.printArea(c, 5);

    }
}

//1. 实现更改某本书的价格
class Book {
    int price;

    public Book(int price) {
        this.price = price;
    }

    public void updatePrice() {
        if (price > 150) price = 150;
        else if (price > 100) price = 100;
    }

    public int getPrice() {
        return price;
    }
}

//2. 计算圆的面积（练习将对象作为参数传递给方法）
class Circle {
    double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
class GetArea {
    public void printArea(Circle c, int times) {
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println(i + "\t" + c.findArea());
        }
    }
}

//3. 复用构造器
class Employee {
    String name;
    String gender;
    int age;
    String job;
    double salary;

    public Employee(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String job, double salary) {
        this.job = job;
        this.salary = salary;
    }

    public Employee(String name, String gender, int age, String job, double salary) {
        this(name, gender, age);
        this.job = job;
        this.salary = salary;
    }
}