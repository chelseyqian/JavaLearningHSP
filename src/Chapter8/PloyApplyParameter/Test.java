package Chapter8.PloyApplyParameter;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("兔子", 10000);
        Manager manager = new Manager("大猫", 20000, 30000);
        showEmpAnnual(worker);
        showEmpAnnual(manager);
        testWork(worker);
        testWork(manager);
    }

    public static void showEmpAnnual(Employee e) {
        System.out.println("年薪为" + e.getAnnual());
    }

    public static void testWork(Employee e) {
        if (e instanceof Worker) {
            //向下转型
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("不做处理");
        }
    }
}
