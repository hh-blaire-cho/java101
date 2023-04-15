package apcsa.y2012;

public class HorseBarn {
    private Horse[] spaces;

    public int findHorseSpace(String target) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null && spaces[i].getName() == target) {
                return i;
            }
        }
        return -1;
    }

    public void consolidate() {
        Horse[] newArr = new Horse[spaces.length];
        int i2 = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (spaces[i] != null) {
                newArr[i2++] = spaces[i];
            }
        }
        spaces = newArr;
    }

    public void setSpaces(Horse[] arr) {
        spaces = arr;
    }

    public void showSpaces() {
        for (Horse h : spaces) {
            if (h == null) {
                System.out.print("null    ");
                continue;
            }
            System.out.print(h.getName() + " " + h.getWeight() + "    ");
        }
        System.out.println();
    }
}
