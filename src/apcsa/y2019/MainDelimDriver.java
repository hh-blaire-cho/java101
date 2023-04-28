package apcsa.y2019;

import java.util.ArrayList;

public class MainDelimDriver {
    public static void run() {
        System.out.println("\n\n\n----------------------");
        System.out.println("APCSA - 2019 - #2 Delimiter");
        System.out.println("----------------------");
        Delimiters dlm1 = new Delimiters("(", ")");
        String[] tokens1 = {"(", "x+y", ")", "*5"};
        System.out.println(dlm1.getDelimitersList(tokens1));

        Delimiters dlm2 = new Delimiters("<q>", "</q>");
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        System.out.println(dlm2.getDelimitersList(tokens2));

        ArrayList<String> checkList = new ArrayList<>();
        checkList.add("(");
        checkList.add(")");
        System.out.print(dlm1.isBalanced(checkList) + "\t");
        checkList.add(")");
        System.out.print(dlm1.isBalanced(checkList) + "\t");
        checkList.add("(");
        System.out.print(dlm1.isBalanced(checkList) + "\t\n");

    }
}
