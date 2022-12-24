//接收一个字符，一个字符表示一个星期中的一天，输出星期几
import java.util.Scanner;
public class Switch01 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("请输入一个字符：");
        char ch = kbd.next().charAt(0);
        switch (ch) {
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
    }
}
