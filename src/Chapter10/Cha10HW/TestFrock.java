package Chapter10.Cha10HW;

public class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
    }
}

class Frock {
    private static int currentNum = 100000;
    private int serialNum;

    public Frock (){
        serialNum = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNum() {
        return serialNum;
    }
}
