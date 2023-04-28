package apcsa.y2019;

import java.util.ArrayList;

public class Delimiters {
    private final String openDel;
    private final String closeDel;

    public Delimiters(String o, String c) {
        openDel = o;
        closeDel = c;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> retList = new ArrayList<>();
        for (String t : tokens) {
            if (t.equals(openDel) || t.equals(closeDel)) {
                retList.add(t);
            }
        }
        return retList;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int cnt = 0;
        for (String s : delimiters) {
            if (s.equals(openDel)) {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt < 0) {
                return false;
            }
        }
        return (cnt == 0);
    }
}
