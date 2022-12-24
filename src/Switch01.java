import java.util.Scanner;
public class Switch01 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        //接收一个字符，一个字符表示一个星期中的一天，输出星期几
        System.out.print("请输入一个字符：");
        char c1 = kbd.next().charAt(0);
        switch (c1) {
            case 'a' :
                System.out.println("今天是星期一");
                break;
            case 'b' :
                System.out.println("今天是星期二");
                break;
            case 'c' :
                System.out.println("今天是星期三");
                break;
            //......
            default:
                System.out.println("你输入的字符不正确");
        }

        //小写转大写
        System.out.print("输入一个字符： ");
        char c2 = kbd.next().charAt(0);
        switch (c2) {
            case 'a' :
                System.out.println("A");
                break;
            case 'b' :
                System.out.println("B");
                break;
            default :
                System.out.println("Other");
        }

        //判断学生成绩是否合格
        System.out.print("输入成绩：");
        int score = kbd.nextInt();
        switch (score) {
            case score >= 60 :

        }

        //根据指定月份打印季节
        System.out.print("输入月份：");
        int month = kbd.nextInt();
        switch (month) {
            case 1 :

        }
    }
}
