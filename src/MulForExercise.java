import java.util.Scanner;
public class MulForExercise {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

//        //1. 3个班，每个班5个学生。输入成绩，求各班平均分和所有班级的平均分
//        double totalave;
//        double sumave = 0;
//        for (int i = 1; i <= 3; i++) {
//            int sum = 0;
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("输入成绩: ");
//                int score = kbd.nextInt();
//                sum += score;
//            }
//            double ave = (double)sum / 5;
//            System.out.println("The average score of class " + i + " is " + ave);
//            sumave += ave;
//        }
//        totalave = sumave / 3;
//        System.out.println("The average score of all classes is " + totalave);
//
//        //2. 统计三个班及格人数，每个班五人
//        int count = 0;
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("输入成绩: ");
//                int score = kbd.nextInt();
//                if (score >= 60)
//                    count++;
//            }
//        }
//        System.out.println(count);
//
//        /*
//        韩老师第一第二题思路
//        化繁为简：
//        （1）先计算一个班，5个学生的平均分，用for
//            1.1 创建Scanner对象，接收用户输入
//            1.2 得到该班级的平均分，定义一个 double sum 把该班级5个学生的成绩累积
//        （2）统计三个班的平均分，在外面用for
//        （3）所有班级的平均分
//            3.1 定义一个变量，double totalScore 累积所有学生的成绩
//            3.2 多重循环结束后，totalScore / （3 * 5）
//        （4）统计三个班及格人数
//            4.1 定义一个变量 int passNum = 0，当有一个学生及格时，passNum++
//         */
//
//        //3. 打印九九乘法表
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
//            }
//            System.out.println();
//        }

        //4. 打印空心金字塔，可以接收一个整数表示层数
        /*
        我的思路
        （1）先写一个每一行不加空格的塔
        （2）加上空格
        （3）变成空心

        韩老师的思路
        化繁为简
        （1）打印一个矩形
        （2）打印半个金字塔
        （3）打印整个金字塔（*数是2*层数-1，空格数是总层数-1）
        （4）打印空心的金字塔（每一行的第一个是*，最后一个也是*，除了最后一行全部输出）
        先死后活
        把层数做成变量
         */
        System.out.print("Enter the level: ");
        int totalLevel = kbd.nextInt();
        for (int i = 1; i <= totalLevel; i++) {
            //输出每一行*前面的空格
            for (int k = 1; k <= totalLevel - i; k++) {
                System.out.print(" ");
            }
            //控制每层*的个数
            for (int j = 1; j <= i * 2 - 1; j++) {
                //当前行的第一个是*，最后一个也是*，最后一行全部是*
                if (j == 1 || j == i * 2 - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {  //其他情况输出空格
                    System.out.print(" ");
                }
            }
            //每打印完一层*后换行
            System.out.println();
        }
    }
}
