package Chapter8.Cha8HW;

public class MainPerson {
    public static void main(String[] args) {
        Person4[] p4 = new Person4[3];
        p4[0] = new Person4("person1", 18);
        p4[1] = new Person4("person2", 17);
        p4[2] = new Person4("person3", 19);

        Person4 temp = null;
        for (int i = 0; i < p4.length - 1; i++) {
            for (int j = 0; j < p4.length - 1; j++) {
                if (p4[j].getAge() > p4[j+1].getAge()) {
                    temp = p4[j];
                    p4[j] = p4[j+1];
                    p4[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < p4.length; i++) {
            System.out.println(p4[i].toString());
        }
    }
}

class Person4 {
    private String name;
    private int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
