package Chapter6;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = {{0, 1}, {2, 3}, {3, 4}};

        //输出二维数组里的每一个元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //输出下列二维数组：
        //1
        //2 2
        //3 3 3
        //创建二维数组，但是只确定一维数组的个数。此时每个一维数组里面是null
        int[][] arr2 = new int[3][];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new int[i + 1]; //给每个一维数组开空间
            //给每个数组的每个元素赋值
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i + 1;
            }
        }
        //输出
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
