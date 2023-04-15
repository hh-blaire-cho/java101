package apcsa.y2012;

public class MainClimbDriver {
    public static void run() {
        System.out.println("\n\n----------------------");
        System.out.println("APCSA - 2012 - #1");
        System.out.println("----------------------");
        System.out.println("part(a) result:");
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimba("Algonquin", 225);
        hikerClub.addClimba("Monadnock", 274);
        hikerClub.addClimba("Whiteface", 301);
        hikerClub.addClimba("Monadnock", 344);
        hikerClub.showList();
        System.out.println("part(b) result:");
        hikerClub.clearList();
        hikerClub.addClimbb("Algonquin", 225);
        hikerClub.addClimbb("Monadnock", 274);
        hikerClub.addClimbb("Whiteface", 301);
        hikerClub.addClimbb("Monadnock", 344);
        hikerClub.showList();
    }
}
