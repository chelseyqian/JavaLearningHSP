package Chapter7;

public class ThisExercise {
    public static void main(String[] args) {
        TestPerson t1 = new TestPerson("Jack", 18);
        TestPerson t2 = new TestPerson("Jack", 18);
        System.out.println(t1.compareTo(t2));
    }
}

class TestPerson {
    String name;
    int age;

    public TestPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(TestPerson p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}
