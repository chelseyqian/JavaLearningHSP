package Chapter10;

//匿名内部类

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AAA tiger = new AAA() {
            @Override
            public void cry() {
                System.out.println("老虎叫");
            }
        };
        tiger.cry();
        tiger.cry();
    }
}

interface AAA {
    public void cry();
}
