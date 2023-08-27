package Chapter13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
    public static void main(String[] args) throws ParseException {

        // 获取当前的时间，为默认格式
        Date d1 = new Date();
        System.out.println("当前日期" + d1);

        // format: 将日期转换成指定格式
        // 创建对象指定格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前日期" + format);

        // 把字符串转成对应日期
        String s = "2023年8月27日 19:30:00 星期日";
        Date parse = sdf.parse(s); // 抛出异常
        System.out.println("parse" + parse);
    }
}
