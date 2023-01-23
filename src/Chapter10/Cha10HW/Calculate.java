package Chapter10.Cha10HW;

//匿名内部类

public class Calculate {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculator() {
            @Override
            public int work(int n1, int n2) {
                return n1 + n2;
            }
        }, 1, 2);
    }
}

interface Calculator {
    public int work(int n1, int n2);
}

class Cellphone{
    public void testWork(Calculator c, int n1, int n2) {
        int result = c.work(n1, n2);
        System.out.println("结果是" + result);
    }
}
