package Fishes;

public class Carp extends Fish {
    private String color;

    public Carp(int weight, String color) {
        super(weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
