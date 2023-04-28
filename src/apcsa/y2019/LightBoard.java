package apcsa.y2019;

public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int nR, int nC) {
        lights = new boolean[nR][nC];
        for (int i = 0; i < nR; i++) {
            for (int j = 0; j < nC; j++) {
                if (Math.random() <= 0.4) {
                    lights[i][j] = true;
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col) {
        int cnt = 0;
        for (int i = 0; i < lights.length; i++) {
            if (lights[i][col]) {
                cnt++;
            }
        }
        if (lights[row][col]) {
            if (cnt % 2 == 0) {
                System.out.print("Divisible by 2:\t");
                return false;
            }
        } else {
            if (cnt % 3 == 0) {
                System.out.print("Divisible by 3:\t");
                return true;
            }
        }
        System.out.print("Returning Current Status:\t");
        return lights[row][col];
    }

    public void setGrid(boolean[][] inputs) {
        lights = inputs;
    }
}
