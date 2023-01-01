package Chapter5;

import java.util.*;
public class BreakExercise {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        for (int i = 2; i >= 0; i--) {
            System.out.print("输入用户名：");
            String name = kbd.next();
            System.out.print("输入密码：");
            int pwd = kbd.nextInt();
            if ("丁真".equals(name) && pwd == 666) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("还有" + i + "次机会");
            }
        }
    }
}
