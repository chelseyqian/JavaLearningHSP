package Chapter6;

public class ArrayExercise {
    public static void main(String[] args) {

        //1. 创建一个char数组，放26个英文字母，并打印
        char[] letter = new char[26];
        for (int i = 0; i < letter.length; i++) {
            letter[i] = (char) ('A' + i);
        }
        for (int j = 0; j < letter.length; j++) {
            System.out.print(letter[j] + " ");
        }

        System.out.println();

        //2. 求出一个int数组的最大值并得到对应的下标
        int[] nums = {4, -1, 9, 10, 23};
        int max = nums[0];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        System.out.println("最大值为" + max + " 对应的下标是" + index);
    }
}
