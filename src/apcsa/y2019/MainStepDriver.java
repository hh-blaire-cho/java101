package apcsa.y2019;

public class MainStepDriver {
    public static void run() {
        System.out.println("\n\n\n----------------------");
        System.out.println("APCSA - 2019 - #3 StepChecker");
        System.out.println("----------------------");
        StepChecker tr = new StepChecker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}
