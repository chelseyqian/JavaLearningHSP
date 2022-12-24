public class ForExercise {
    public static void main(String[] args) {

        //1. 打印1-100之间所有是9的倍数的整数，统计个数及总和
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
                count++;
                sum+=i;
            }
        }
        System.out.println();
        System.out.println();

        //2. 输出表达式
        for (int i = 0, j = 5; i <= 5; i++, j--) {
            System.out.println(i + " + " + j + " = " + (i + j));
        }
        //可以只用一个变量
    }
}
