package apcsa.y2019;

public class StepChecker {
    int goal;
    int stepCount;
    int dayCount;
    int activeDayCount;

    public StepChecker(int x) {
        goal = x;
        stepCount = 0;
        dayCount = 0;
        activeDayCount = 0;
    }

    public void addDailySteps(int x) {
        stepCount += x;
        dayCount++;
        if (x >= goal) {
            activeDayCount++;
        }
    }

    public int activeDays() {
        return activeDayCount;
    }

    public double averageSteps() {
        if (dayCount == 0) {
            return 0.0;
        }
        return (double) stepCount / dayCount;
    }
}

