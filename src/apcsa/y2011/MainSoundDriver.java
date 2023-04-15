package apcsa.y2011;

/**
 * DO NOT CHANGE!!!
 */
public class MainSoundDriver {
    public static void run() {
        System.out.println("\n\n----------------------");
        System.out.println("APCSA - 2011 - #1");
        System.out.println("----------------------");
        int[] inputs = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        Sound sound = new Sound();
        sound.setSamples(inputs);
        sound.showSamples();
        System.out.println("sound.limitAmplitude(2000):\t" + sound.limitAmplitude(2000));
        sound.showSamples();
        int[] inputs2 = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        System.out.println("\nSamples updated to have some zeros");
        sound.setSamples(inputs2);
        sound.showSamples();
        System.out.println("sound.trimSilenceFromBeginning() executed");
        sound.trimSilenceFromBeginning();
        sound.showSamples();


    }
}
