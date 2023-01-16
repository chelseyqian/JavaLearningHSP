package Chapter10;

public class CodeBlockDetail2 {
    public static void main(String[] args) {
        new BB();
    }
}

class AA { //父类
    {
        System.out.println("AA的普通代码块");
    }

    public AA() {
        //1. super()
        //2. 调用本类的普通代码块
        System.out.println("AA的构造器");
    }
}

class BB extends AA {
    {
        System.out.println("BB的普通代码块");
    }

    public BB() {
        //1. super()
        //2. 调用本类的普通代码块
        System.out.println("BB的构造器");
    }
}
