package Chapter6;//杨辉三角
import java.util.*;

public class YangHui {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("要多少行的杨辉三角？");
        int num = kbd.nextInt();
        int[][] arr = new int[num][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];

            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j]  = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
