package Chapter11;

//自定义实现枚举

public class Enumeration1 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}

class Season {
    private String name;
    private String dese;//描述

    public static Season SPRING = new Season("春天", "温暖");
    public static Season SUMMER = new Season("夏天", "炎热");
    public static Season AUTUMN = new Season("秋天", "凉爽");
    public static Season WINTER = new Season("冬天", "寒冷");

    private Season(String name, String dese) {
        this.name = name;
        this.dese = dese;
    }

    public String getName() {
        return name;
    }

    public String getDese() {
        return dese;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", dese='" + dese + '\'' +
                '}';
    }
}
