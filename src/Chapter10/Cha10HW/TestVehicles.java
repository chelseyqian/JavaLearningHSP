package Chapter10.Cha10HW;

//唐僧的交通工具

public class TestVehicles {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();
        tang.passRiver();
    }
}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {
    public void work() {
        System.out.println("用马作为交通工具");
    }
}

class Boat implements Vehicles {
    public void work() {
        System.out.println("用船作为交通工具");
    }
}

class Plane implements Vehicles {
    public void work() {
        System.out.println("用飞机作为交通工具");
    }
}

class Factory {
    //始终用同一匹马，用饿汉式
    private Factory(){}

    private static Horse horse = new Horse();

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void common() {
        if (!(vehicles instanceof Horse)) {
            //向上转型
            vehicles = Factory.getHorse();
        }
        //直接用接口调用
        vehicles.work();
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat)) {
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }

    public void passMountain() {
        if (!(vehicles instanceof Plane)) {
            vehicles = Factory.getPlane();
        }
        vehicles.work();
    }
}
