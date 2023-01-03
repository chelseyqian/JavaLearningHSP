package Chapter8;

public class EqualsExercise {

}

class Person2 {
    private String name;
    private int age;
    private char gender;

    //重写Object的equals方法
    public boolean equals(Object obj) {
        //先判断比较的对象是否为同一个对象，是就返回true（同一个对象属性肯定相同）
        if (this == obj) {
            return true;
        }
        //类型判断
        if (obj instanceof Person2) { //是Person2才比较
            //向下转型，因为要得到Object的各个属性
            Person2 p1 = (Person2) obj;
            return this.name.equals(p1.name) && this.age == p1.age && this.gender == p1.gender;
        }
        return false;
    }

    public Person2(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
