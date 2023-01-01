package Chapter7;
//石头剪刀布

import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        Play p = new Play();

        System.out.println("游戏开始");
        System.out.print("这局你想出什么？ 0：石头  1：剪刀  2：布  3：退出游戏  请输入数字：");
        int pAnswer = kbd.nextInt();

        while (pAnswer != 3) {
            int comAnswer = (int)(Math.random() * 3);
            p.play(comAnswer, pAnswer);
            System.out.println();
            System.out.print("这局你想出什么？ 0：石头  1：剪刀  2：布  3：退出游戏  请输入数字：");
            pAnswer = kbd.nextInt();
        }

        System.out.println("一共玩了" + p.getCountRound() + "局，你赢了" + p.getPWin()
                + "局，电脑赢了" + p.getComWin() + "局");
        System.out.println("游戏结束");
    }
}
//0是石头，1是剪刀，2是布
class Play {

    static int countRound = 0;
    static int pWin = 0;
    static int comWin = 0;

    public void play(int c, int p) {
        if (c == 0 && p == 1) {
            System.out.println("电脑出的是石头，你出的是剪刀。电脑赢了");
            comWin++;
            countRound++;
        } else if (c == 1 && p == 2) {
            System.out.println("电脑出的是剪刀，你出的是布。电脑赢了");
            comWin++;
            countRound++;
        } else if (c == 2 && p == 0) {
            System.out.println("电脑出的是布，你出的是石头。电脑赢了");
            comWin++;
            countRound++;
        } else if (p == 0 && c == 1) {
            System.out.println("电脑出的是剪刀，你出的是石头。你赢了");
            pWin++;
            countRound++;
        } else if (p == 1 && c == 2) {
            System.out.println("电脑出的是布，你出的是剪刀。你赢了");
            pWin++;
            countRound++;
        } else if (p == 2 && c == 0) {
            System.out.println("电脑出的是石头，你出的是布。你赢了");
            pWin++;
            countRound++;
        } else {
            System.out.println("平局");
            countRound++;
        }
    }

    public int getCountRound() {return countRound;}
    public int getPWin() {return pWin;}
    public int getComWin() {return comWin;}

}
