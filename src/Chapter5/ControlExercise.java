package Chapter5;//控制结构练习

import java.util.*;
public class ControlExercise {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        //1. 经过路口要交费，计算可以经过多少次（while break）
        double money = 100000;
        int count1 = 0;
        while (true) {
            if (money > 50000) {
                money *= 0.95;
                count1++;
            } else if (money >= 1000) {
                money -= 1000;
                count1++;
            } else {
                break;
            }
        }
        System.out.println("可以经过" + count1 + "个路口");

        System.out.println();

        //2. 判断是否为水仙花数，即一个三位数各个位上数字的立方和等于它本身
        //n的百位 = n / 100
        //n的十位 = n % 100 / 10
        //n的个位 = n % 10
        System.out.print("输入一个三位数：");
        double num = kbd.nextInt();
        double sum1 = 0;
        sum1 = Math.pow(num / 100, 3) + Math.pow(num % 100 / 10, 3) + Math.pow(num % 10, 3);
        if (sum1 == num) System.out.println("这个整数是水仙花数");
        else System.out.println("这个整数不是水仙花数");
        //错误

        System.out.println();

        //3. 输出1-100之间不能被5整除的数，每5个一行
        int count2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.print(i + "\t");
                count2++;
                if (count2 % 5 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println();

        //4. 输出小写的a-z和大写的Z-Chapter7.A
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            System.out.print(c1 + " ");
        }
        System.out.println();
        for (char c2 = 'Z'; c2 >= 'A'; c2--) {
            System.out.print(c2 + " ");
        }

        System.out.println();

        //5. 求出1-1/2+1/3-1/4...1/100的和
        double sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum2 -= 1.0 / i;
            } else {
                sum2 += 1.0 / i;
            }
        }
        System.out.println("和为" + sum2);

        System.out.println();

        //6. 求1 + （1 + 2） + （1 + 2 + 3）+...+（1 + 2 +...+100）的和
        int sum3 = 1;
        for (int last = 2; last <= 100; last++) {
            sum3 += (1 + last) * last / 2;
        }
        System.out.println("和为" + sum3);
    }
}
