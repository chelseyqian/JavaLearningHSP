package Chapter10.Cha10HW;

//局部内部类

public class TestAB {
    public static void main(String[] args) {
        new A().m1();
    }
}

class A {
    private String NAME = "hello";

    public void m1() {
        class B {
                private final String NAME = "Jack";

            public void show() {
                System.out.println(NAME + " " + A.this.NAME);
            }
        }

        B b = new B();
        b.show();
    }
}
