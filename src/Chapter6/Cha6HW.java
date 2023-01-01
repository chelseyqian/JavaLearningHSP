package Chapter6;//第六章作业
import java.util.*;

public class Cha6HW {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        //1. 已有一个升序数组，要求插入一个元素该数组依然是升序
        int[] arr1 = {10, 12, 45, 90};
        System.out.print("Enter a number: ");
        int n1 = kbd.nextInt();
        int index = arr1.length;
        //找出要插入的位置
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= n1) {
                index = i;
                break;
            }
        }

        int[] arrNew = new int[arr1.length + 1];
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i != index) {
                arrNew[i] = arr1[j];
                j++; //如果[i]的位置是要插入的数，j就不会++
            } else {
                arrNew[i] = n1;
            }
        }


        //2. 随机在1-100之间生成十个整数，保存到数组，倒序打印，求平均值，求最大值和最大值的下标，查找是否有8
        int[] arr2 = new int[10];
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            int n2 = (int)(Math.random()*100) + 1;
            arr2[i] = n2;
        }
        //倒序打印，求和。这里倒序打印其实指的是反过来打印，不改了
        int temp;
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] < arr2[j+1]) {
                    temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = arr2[j];
                }
            }
        }
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + " ");
            sum += arr2[k];
        }
        System.out.println();
        //求均值
        double ave = sum / 10.0;
        System.out.println("均值是" + ave);
        //求最大值和最大值的下标
        int max = arr2[0];
        int maxIndex = 0;
        for (int a = 0; a < arr2.length; a++) {
            if (arr2[a] > max) {
                max = arr2[a];
                maxIndex = a;
            }
        }
        System.out.println("最大值是" + max + " 最大值的下标是" + maxIndex);
        //查找是否有8
        int eightIndex = -1;
        for (int b = 0; b < arr2.length; b++) {
            if (arr2[b] == 8) eightIndex = b;
        }
        if (eightIndex == -1) System.out.println("没有8");
        else System.out.println("有8");

    }
}
