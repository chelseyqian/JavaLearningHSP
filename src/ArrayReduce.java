//数组缩减练习
import java.util.*;
public class ArrayReduce {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};
        do {
            System.out.print("现在的数组是：");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.print("是否缩减数组？");
            char answer = kbd.next().charAt(0);
            if (answer != 'n' && arr.length > 1) {
                int[] arrNew = new int[arr.length - 1];
                for (int i = 0; i < arrNew.length; i++) {
                    arrNew[i] = arr[i];
                }
                arr = arrNew;
            } else if (arr.length == 1){
                System.out.println("不能再缩减");
                break;
            } else {
                break;
            }
        } while (true);
    }
}
