package Chapter11;

public class EnumerationExercise {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }
    }
}

enum Week {
    Monday("星期一"), Tuesday("星期二"), Wednesday("星期三");

    private String day;

    private Week(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return day;
    }
}
