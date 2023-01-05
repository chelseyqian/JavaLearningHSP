package Chapter8.Cha8HW;

public class People {
    public static void main(String[] args) {
        Person[] p = new Person[4];
        p[0] = new Student("小明", '男', 15, "00023102");
        p[1] = new Student("小红", '女', 16, "00025123");
        p[2] = new Teacher("张飞", '男', 30, 8);
        p[3] = new Teacher("刘备", '男', 40, 18);

        compare(p);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString()); //toString可以不写
        }

        for (int j = 0; j < p.length; j++) {
            System.out.println(p[j]);
        }
    }

    public static void compare(Person[] people) {
        Person temp;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() > people[j+1].getAge()) {
                    temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }

    public static void test(Person persons) {
        if (persons instanceof Student) {
            ((Student) persons).study();
        } else if (persons instanceof Teacher) {
            ((Teacher) persons).teach();
        } else {
            System.out.println("无");
        }
    }
}

class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return name + "爱玩";
    }

    public String basicInfo() {
        return "姓名：" + name + "\n性别：" + gender + "\n年龄" + age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

class Student extends Person{
    private String stu_id;

    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我要好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public void printInfo() {
        System.out.println("学生的信息：");
        System.out.println(super.basicInfo());
        System.out.println("学号：" + stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}

class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我要认真教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void printInfo() {
        System.out.println("老师的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄：" + work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}