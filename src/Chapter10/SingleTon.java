package Chapter10;

//单例模式

public class SingleTon {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        BoyFriend instance2 = BoyFriend.getInstance();
        System.out.println(instance2);
    }
}

//饿汉式
class GirlFriend {
    private String name;

    private static GirlFriend gf = new GirlFriend("女朋友");

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

//懒汉式
class BoyFriend {
    private String name;

    private static BoyFriend bf;

    private BoyFriend(String name) {
        this.name = name;
    }

    public static BoyFriend getInstance() {
        if (bf == null) {
            bf = new BoyFriend("男朋友");
        }
        return bf;
    }

    @Override
    public String toString() {
        return "BoyFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}