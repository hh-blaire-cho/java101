package apcsa.y2012;

import java.util.ArrayList;
import java.util.List;

public class ClimbingClub {
    private final List<ClimbInfo> climbList;

    public ClimbingClub() {
        climbList = new ArrayList();
    }

    public void addClimba(String peakName, int climbTime) {
        climbList.add(new ClimbInfo(peakName, climbTime));
    }


    public void addClimbb(String newName, int newTime) {
        ClimbInfo ci = new ClimbInfo(newName, newTime);
        for (int i = 0; i < climbList.size(); i++) {
            String curName = climbList.get(i).getName();
            if (newName.compareTo(curName) <= 0) {
                climbList.add(i, ci);
                return;
            }
        }
        climbList.add(ci);
    }

    public int distinctPeakNames() {
        if (climbList.size() == 0) {
            return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        for (int k = 1; k < climbList.size(); k++) {
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0) {
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }

    public void showList() {
        for (ClimbInfo ci : climbList) {
            System.out.print(ci.getName() + " " + ci.getTime() + "    ");
        }
        System.out.println();
    }

    public void clearList() {
        this.climbList.clear();
    }
}
