public class VarParameterExercise {
    public static void main(String[] args) {

        C show = new C();
        System.out.println(show.showScore("Jack", 91.1, 80.2));
    }
}

class C {
    public String showScore(String s, double... nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return s + "的总分为" + sum;
    }
}
