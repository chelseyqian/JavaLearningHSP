package Chapter13;

public class Cha13HW {

    // 1. String 反转
    public static String reverse(String str, int start, int end) {
        // 先对输入参数验证。可以写出正确的情况，然后取反。
        if (!(str != null && start >= 0 && start < end && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }

        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    // 2. 检测注册信息
    public static void userRegister(String name, String pwd, String email) {
        if (name.length() < 2 || name.length() > 4) {
            throw new RuntimeException("用户名长度不符");
        }

        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度应为6，且全是数字");
        }

        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱须包含@和.  且.在@后面");
        }

        if (name == null || pwd == null || email == null) {
            throw new RuntimeException("参数不能为空");
        }
    }

    // 第二题里的方法，检验是否为数字
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

    // 3. 改变名字格式
    public static void printName(String str) {
        if (str == null) {
            System.out.println("名字不能为空");;
            return;
        }

        String[] name = str.split(" ");

        if (name.length != 3) {
            System.out.println("名字格式不对");
            return;
        }

        String format = String.format("%s, %s .%c", name[2], name[0], name[1].toUpperCase().charAt(0));
        System.out.println(format);
    }

    public static void main(String[] args) {

        // 1.
        String s = "hello";
        try {
            s = reverse(s, 1, 4);
        } catch (Exception e) {  // 有可能有异常,用try-catch
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(s);

        // 2.
        String name = "Jack";
        String pwd = "123456";
        String email = "Jack@gmail.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
