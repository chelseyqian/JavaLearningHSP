import java.util.Scanner;
public class DoWhileExercise {
    public static void main(String[] args) {

        //1. 十句你好
        int i = 1;
        do {
            System.out.println("Hello!" + i);
            i++;
        } while (i <= 10);

        //2. 1-200中能被5整除但是不能被3整除的个数
        /*
        化繁为简的步骤
        1. 用do-while输出1-200
        2. 过滤能被5整除但是不能被3整除的数
        3. 统计满足条件的个数
         */
        int j = 1;
        int count = 0;
        do {
            if (j % 5 == 0 && j % 3 != 0 ) {
                System.out.println(j);
                count++;
            }
            j++;
        } while (j <= 200);
        System.out.println(count);

        //3. 要账
        /*
        化繁为简
        1. 不停地问还钱吗？
        2. 用一个char接收回答，定义一个Scanner对象
        3. 判断循环的条件
         */
        Scanner kbd = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("老韩问：还钱吗？ y/n");
            answer = kbd.next().charAt(0);
            System.out.println("他的回答是 " + answer);
        } while (answer == 'n');

    }
}
