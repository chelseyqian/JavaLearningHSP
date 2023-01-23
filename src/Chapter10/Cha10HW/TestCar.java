package Chapter10.Cha10HW;

//车内空调

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car(32);
        car1.air().flow();
    }
}

class Car {
    private int temperature;

    public Car(int temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature >= 30) {
                System.out.println("吹冷气");
            } else if (temperature <= 0) {
                System.out.println("吹暖气");
            } else {
                System.out.println("不吹气");
            }
        }
    }

    //返回一个Air对象
    public Air air() {
        return new Air();
    }
}
