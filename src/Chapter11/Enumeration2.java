package Chapter11;

//使用enum关键字实现枚举

public class Enumeration2 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
    }
}

enum Season2 {

    SPRING("春天", "温暖"), SUMMER("夏天", "炎热");

    private String name;
    private String dese;

    private Season2(String name, String dese) {
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
