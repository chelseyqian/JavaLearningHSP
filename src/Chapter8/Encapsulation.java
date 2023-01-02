package Chapter8;

//封装的介绍题

public class Encapsulation {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("大猫");
        p.setAge(46);
        p.setSalary(20000);
        System.out.println(p.getInfo());

        Person p2 = new Person("兔子", 45, 10000);
        System.out.println(p2.getInfo());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        /*
        如果直接这样设置，就不能检查信息是否合格
        this.name = name;
        this.age = age;
        this.salary = salary;
         */
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字的长度应在2-4个字符之间");
            this.name = "未知";
        }
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄不在实际范围");
            this.age = 0;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getInfo() {
        return "name=" + name + " age=" + age + " salary=" + salary;
    }
}
