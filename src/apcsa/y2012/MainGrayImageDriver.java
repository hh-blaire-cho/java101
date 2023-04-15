package apcsa.y2012;

public class MainGrayImageDriver {
    public static void run() {
        System.out.println("\n\n----------------------");
        System.out.println("APCSA - 2012 - #4");
        System.out.println("----------------------");
        GrayImage gi = new GrayImage();
        gi.setPixelValues(new int[][]{{255, 184, 178, 84, 129}, {84, 255, 255, 130, 84},
                {78, 255, 0, 0, 78}, {84, 130, 255, 130, 84}});
        System.out.println("part(a) result: " + gi.countWhitePixels());
        gi.setPixelValues(new int[][]{{221, 184, 178, 84, 135}, {84, 255, 255, 130, 84},
                {78, 255, 0, 0, 78}, {84, 130, 255, 130, 84}});
        System.out.println("part(b) result:");
        System.out.println("Before Processing.....");
        gi.showPixelValues();
        System.out.println("After Processing.....");
        gi.processImage();
        gi.showPixelValues();


    }
}
