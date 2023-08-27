package Chapter13;

import java.util.Calendar;

public class Calendar1 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance(); // 创建Calendar对象
        System.out.println("c = " + c);

        System.out.println("年：" + c.get(Calendar.YEAR));
    }
}
