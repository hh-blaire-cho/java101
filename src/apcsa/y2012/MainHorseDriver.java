package apcsa.y2012;

public class MainHorseDriver {
    public static void run() {
        System.out.println("\n\n----------------------");
        System.out.println("APCSA - 2012 - #3");
        System.out.println("----------------------");
        HorseBarn sweetHome = new HorseBarn();
        Horse[] horses = new Horse[7];
        horses[0] = new Horse("Trigger", 1340);
        horses[1] = null;
        horses[2] = new Horse("Silver", 1210);
        horses[3] = new Horse("Lady", 1575);
        horses[4] = null;
        horses[5] = new Horse("Patches", 1350);
        horses[6] = new Horse("Duke", 1410);
        sweetHome.setSpaces(horses);

        System.out.println("part(a) result:");
        System.out.println("Finding Trigger's Space " + sweetHome.findHorseSpace("Trigger"));
        System.out.println("Finding Silver's Space " + sweetHome.findHorseSpace("Silver"));
        System.out.println("Finding Coco's Space " + sweetHome.findHorseSpace("Coco"));

        System.out.println("part(b) result:");
        System.out.println("before consolidating.....");
        sweetHome.showSpaces();
        sweetHome.consolidate();
        System.out.println("after consolidating.....");
        sweetHome.showSpaces();
    }
}
