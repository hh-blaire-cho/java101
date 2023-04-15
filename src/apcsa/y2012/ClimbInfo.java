package apcsa.y2012;

public class ClimbInfo {
    String peakName;
    int climbTime;

    public ClimbInfo(String peakName, int climbTime) {
        this.peakName = peakName;
        this.climbTime = climbTime;
    }

    public String getName() {
        return peakName;
    }

    public int getTime() {
        return climbTime;
    }
}
