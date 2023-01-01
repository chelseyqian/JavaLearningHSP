package Chapter7;
//递归

public class RecursionExercise {
    public static void main(String[] args) {

    }
}

class A {
    //递归斐波那契数
    public int getNum(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else if (n >= 3) {
            return getNum(n - 1) + getNum( n - 2);
        } else {
            System.out.println("只能输入正数");
            return -1;
        }
    }

    /*
    猴子吃桃
    有一堆桃子，猴子第一天吃了其中的一半多一个，之后每天猴子都吃其中的一半多一个，到第10天还没吃时，发现只有一个桃子

    思路
    规律：前一天的桃子 = （后一天的桃子+1）*2
     */
    public int peach(int days) {
        if (days == 10) {
            return 1;
        } else if (days >= 1 && days <= 9) {
            return peach((days + 1) + 1) * 2;
        } else {
            System.out.println("天数不在范围内");
            return -1;
        }
    }
}
