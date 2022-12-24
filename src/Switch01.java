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
        double score = kbd.nextDouble();
        if (score >= 0 && score <= 100) {
            switch ((int)(score/60)) {
                case 0 :
                    System.out.println("不及格");
                    break;
                case 1 :
                    System.out.println("及格");
            }
        } else {
            System.out.println("输入有误");
        }

        //根据指定月份打印季节
        System.out.print("输入月份：");
        int month = kbd.nextInt();
        switch (month) {
            case 3 :
            case 4 :
            case 5 :
                System.out.println("春天");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("夏天");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("秋天");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("冬天");
        }
    }
}
