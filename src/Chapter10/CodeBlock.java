package Chapter10;

public class CodeBlock {
    public static void main(String[] args) {
        Movie movie = new Movie("电影名");
    }
}

class Movie {
    private String name;
    private double price;

    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影开始");
    }

    public Movie(String name) {
        this.name = name;
        System.out.println(name);
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
