package apcsa.y2011;

public class Sound {
    private int[] samples;

    public int limitAmplitude(int limit) {
        int positive = Math.abs(limit);
        int negative = -positive;
        int count = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] > positive) {
                count++;
                samples[i] = positive;
            } else if (samples[i] < negative) {
                count++;
                samples[i] = negative;
            }
        }
        return count;
    }

    public void trimSilenceFromBeginning() {
        int nonZeroIdx = 0;
        while (samples[nonZeroIdx] == 0) {
            nonZeroIdx++;
        }
        int[] newArr = new int[samples.length - nonZeroIdx];
        System.arraycopy(samples, nonZeroIdx, newArr,
                0, samples.length - nonZeroIdx);
    }


    /**
     * additionally given (to help code testing)
     */
    public void setSamples(int[] arr) {
        samples = arr;
    }


    /**
     * additionally given (to help code testing)
     */
    public void showSamples() {
        System.out.print("Current Samples: [ ");
        for (int s : samples) {
            System.out.print(s + " ");
        }
        System.out.println("]");
    }
}
