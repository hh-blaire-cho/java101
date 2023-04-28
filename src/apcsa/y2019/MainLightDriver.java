package apcsa.y2019;

public class MainLightDriver {
    public static void run() {
        System.out.println("\n\n\n----------------------");
        System.out.println("APCSA - 2019 - #4 LightBoard");
        System.out.println("----------------------");
        LightBoard sim = new LightBoard(7, 5);
        boolean[][] inputs = {
                {true, true, false, true, true},
                {true, false, false, true, false},
                {true, false, false, true, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, false, true, true},
                {false, false, false, false, false}};
        sim.setGrid(inputs);
        System.out.println(sim.evaluateLight(0, 3));
        System.out.println(sim.evaluateLight(6, 0));
        System.out.println(sim.evaluateLight(4, 1));
        System.out.println(sim.evaluateLight(5, 4));
    }
}
