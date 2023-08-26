package Chapter13;

public class StringBufferExercise {
    public static void main(String[] args) {

        // 将数字写成有逗号的形式
        String price = "123123564.59";
        StringBuffer sb = new StringBuffer(price);
        int index = price.lastIndexOf(".");

        for (int i = index - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }

        System.out.print(sb);
    }
}
