package Chapter7;

public class MethodExercise {
    public static void main(String[] args) {

        Person p = new Person();
        p.name = "Jack";
        p.age = 15;
        MyTools tool = new MyTools();
        Person p2 = tool.copyPerson(p);
    }
}

class Person {
    String name;
    int age;
}

class MyTools {
    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //克隆对象
    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}

class AA {
    public boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public void print(int n1, int n2, char c) {
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
