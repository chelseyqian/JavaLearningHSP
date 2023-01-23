package Chapter11;

//选择颜色

public class Cha11HW {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
    }
}

interface MyInterface {
    public void show();
}

enum Color implements MyInterface {
    RED(255, 0, 0), BLUE(0, 255, 255),
    BLACK(0, 0, 0), YELLOW(255, 255, 0),
    GREEN(0 ,255, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public void show() {
        System.out.println("属性值为 " + redValue + ", " + greenValue + ", " + blueValue);
    }
}
