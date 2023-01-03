package Project.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    Scanner kbd = new Scanner(System.in);

    boolean loop = true;
    int choice;

    String details = "--------零钱通明细--------";

    double money = 0;
    double balance = 0;
    Date date = null; //date是java.util.Date类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //用于日期格式化

    String note;

    public void Menu() {
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
                    this.showDetails();
                    break;
                case 2 :
                    this.income();
                    break;
                case 3 :
                    this.pay();
                    break;
                case 4 :
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        } while (loop);
    }

    public void showDetails() {
        System.out.println(details);
    }

    public void income() {
        System.out.print("入账金额：");
        money = kbd.nextDouble();
        if (money <= 0) {
            System.out.println("金额不合理  返回菜单");
            return; //退出方法，不再执行后面的代码
        }
        balance += money;
        date = new Date(); //获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void pay() {
        System.out.print("消费金额：");
        money = kbd.nextDouble();
        if (money < 0 || money > balance) {
            System.out.println("消费金额不合理  返回菜单");
            return;
        }
        System.out.print("消费说明：");
        note = kbd.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit() {
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
    }
}
