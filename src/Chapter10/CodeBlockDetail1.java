package Chapter10;

public class CodeBlockDetail1 {
    public static void main(String[] args) {
        new B();
        System.out.println(Cat.n1);
        C c1 = new C();
        C c2 = new C();
    }
}

class A {
    static {
        System.out.println("A类的静态代码块被执行");
    }
}

class B extends A {
    static {
        System.out.println("B类的静态代码块被执行");
    }
}

class Cat {
    public static int n1 = 10;

    static {
        System.out.println("Cat类的静态代码块被执行");
    }
}

class C {
    static {
        System.out.println("C类的静态代码块被执行");
    }

    {
        System.out.println("C类的普通代码块被执行");
    }
}
