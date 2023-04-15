package apcsa.y2012;

public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;
    private int[][] pixelValues;

    public int countWhitePixels() {
        int cnt = 0;
        for (int i = 0; i < pixelValues.length; i++) {
            for (int j = 0; j < pixelValues[0].length; j++) {
                if (pixelValues[i][j] == WHITE) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public void processImage() {
        for (int i = 0; i < pixelValues.length - 2; i++) {
            for (int j = 0; j < pixelValues[0].length - 2; j++) {
                if (pixelValues[i][j] > BLACK) {
                    int num = pixelValues[i][j] - pixelValues[i + 2][j + 2];
                    pixelValues[i][j] = num;
                } else {
                    pixelValues[i][j] = BLACK;
                }
            }
        }
    }

    public void setPixelValues(int[][] arr2D) {
        this.pixelValues = arr2D;
    }

    public void showPixelValues() {
        for (int i = 0; i < pixelValues.length; i++) {
            for (int j = 0; j < pixelValues[0].length; j++) {
                System.out.printf("%03d ", pixelValues[i][j]);
            }
            System.out.println();
        }
    }
}
