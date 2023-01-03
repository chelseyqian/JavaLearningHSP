package Project.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSystem {

    /*
    化繁为简
    1. 先完成显示菜单，并能够被选择
    2. 完成明细
    3. 完成收益入账
    4. 消费
     */

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        //最好用do-while循环，因为菜单至少要显示一次
        boolean loop = true;
        int choice;

        String details = "--------零钱通明细--------";

        double money = 0;
        double balance = 0;
        Date date = null; //date是java.util.Date类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //用于日期格式化

        String note;

        do {
            System.out.println("\n--------零钱通菜单--------");
            System.out.println("\t1.查看零钱通明细");
            System.out.println("\t2.记录收益入账");
            System.out.println("\t3.记录消费");
            System.out.println("\t4.退出");

            System.out.print("请选择（输入1-4）：");
            choice = kbd.nextInt();

            //用switch分支结构
            switch (choice) {
                case 1 :
                    System.out.println(details);
                    break;
                case 2 :
                    System.out.print("入账金额：");
                    money = kbd.nextDouble();
                    if (money <= 0) {
                        System.out.println("金额不合理  返回菜单");
                        break;
                    }
                    balance += money;
                    date = new Date(); //获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case 3 :
                    System.out.print("消费金额：");
                    money = kbd.nextDouble();
                    if (money < 0 || money > balance) {
                        System.out.println("消费金额不合理  返回菜单");
                        break;
                    }
                    System.out.print("消费说明：");
                    note = kbd.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case 4 :
                    char answer;
                    while (true) {
                        System.out.print("你确定要退出吗？y/n");
                        answer = kbd.next().charAt(0);
                        if (answer == 'y' || answer == 'n') {
                            break;
                        }
                    }
                    if (answer == 'y') {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        } while (loop);

        System.out.println("退出了零钱通");
    }
}
