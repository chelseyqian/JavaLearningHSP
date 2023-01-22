package Chapter10;

//匿名内部类

public class AnonymousInnerClass {
    public static void main(String[] args) {

        //用对象接收
        AAA tiger = new AAA() {
            @Override
            public void cry() {
                System.out.println("老虎叫");
            }
        };
        tiger.cry();
        tiger.cry();

        Outer outer = new Outer();
        outer.m1();

    }
}

interface AAA {
    public void cry();
}

class Outer {
    public void m1() {
        Person person = new Person() {
            @Override
            public void hi() {
                System.out.println("重写了hi方法");
            }
        };
        person.hi();

        //直接调用
        new Person() {
            public void hi() {
                System.out.println("又重写了hi方法");
            }
        }.hi();
    }
}

class Person {
    public void hi() {
        System.out.println("hi方法");
    }
    public void name(String name) {
        System.out.println(name);
    }
}
