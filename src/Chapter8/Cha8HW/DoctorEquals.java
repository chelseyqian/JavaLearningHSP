package Chapter8.Cha8HW;

public class DoctorEquals {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("d1", 40, 20000);
        Doctor doctor2 = new Doctor("d2", 35, 10000);

        System.out.println(doctor1.equals(doctor2));
    }
}

class Doctor {
    private String name;
    private int age;
    private double salary;

    public Doctor(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //重写equals，判断两个对象的属性是否相等

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        //判断obj的运行类型是否为Doctor类型或其子类
        if (!(obj instanceof Doctor)) return false;

        //已经确定obj运行类型为Doctor类型或其子类，向下转型调用方法比较
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name) && this.age == doctor.age && this.salary == doctor.salary;
    }
}
