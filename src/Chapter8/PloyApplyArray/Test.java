package Chapter8.PloyApplyArray;

public class Test {
    public static void main(String[] args) {
        Person[] p = new Person[5];
        p[0] = new Person("Jack", 18);
        p[1] = new Student("student1", 17, 80);
        p[2] = new Student("student2", 19, 60);
        p[3] = new Teacher("teacher1", 26, 3000);
        p[4] = new Teacher("teacher2", 40, 10000);

        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Student) {
                ((Student) p[i]).study();
                System.out.println(p[i].say());
                System.out.println();
            } else if (p[i] instanceof Teacher) {
                ((Teacher) p[i]).teach();
                System.out.println(p[i].say());
                System.out.println();
            } else {
                System.out.println(p[i].say());
                System.out.println();
            }
        }
    }
}
