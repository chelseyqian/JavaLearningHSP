package Chapter12;

//自定义异常

public class ExceptionExercise {
    public static void main(String[] args) {
        int age = 80;

        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄不在范围内");
        }
        System.out.println("年龄在范围内");
    }
}

class AgeException extends RuntimeException {

    //构造器
    public AgeException(String message) {
        super(message);
    }
}
