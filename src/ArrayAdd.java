//数组扩容
import java.util.*;
public class ArrayAdd {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int[] arr1 = {1, 2, 3};
        do {
            int[] arr2 = new int[arr1.length + 1];

            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
            System.out.print("请输入你要添加的元素：");
            int addNum = kbd.nextInt();
            arr2[arr2.length - 1] = addNum;
            arr1 = arr2;

            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + "\t");
            }

            System.out.print("是否继续添加？");
            char answer = kbd.next().charAt(0);
            if (answer == 'n') {
                break;
            }
        } while (true);
    }
}
