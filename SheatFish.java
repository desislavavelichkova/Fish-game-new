package Fishes;


public class SheatFish extends Fish {
    private int whisckerLength;

    public SheatFish(int weight, int whisckerLength) {
        super(weight);
        this.whisckerLength = whisckerLength;
    }

    public int getWhisckerLength() {
        return whisckerLength;
    }

    public void setWhisckerLength(int whisckerLength) {
        this.whisckerLength = whisckerLength;
    }

}