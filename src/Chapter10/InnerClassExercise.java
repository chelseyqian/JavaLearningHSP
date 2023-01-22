package Chapter10;

public class InnerClassExercise {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //匿名内部类当作实参
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {
        bell.ring();
    }
}
