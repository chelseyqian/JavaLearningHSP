package Chapter8;

public class DebugExercise {
    public static void main(String[] args) {
        Person3 p3 = new Person3("Jack", 20);
        System.out.println(p3);
    }
}

class Person3 {
    private String name;
    private int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}