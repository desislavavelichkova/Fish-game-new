import Fishes.Carp;
import Fishes.Fish;
import Fishes.SheatFish;

import java.util.ArrayList;

public class Pond {

    private String state;
    private int power;
    ArrayList<Fish> fishes;
    int num = 1;

    public Pond() {
        this.fishes = new ArrayList<Fish>();
        this.state = state;
        this.power = power;
    }

    public void ShowState() {
        if (fishes.size() >= 0 && fishes.size() < 5) {
            state = "poor";
        } else if (fishes.size() >= 5 && fishes.size() <= 10) {
            state = "normal";
        } else if (fishes.size() > 10) {
            state = "rich";
        }
        System.out.println("The state of the pond is " + state + ".");
    }

    public int getPower() {
        if (power < 0) {
            power = 0;
        }
        return power;
    }

    public void ShowCapacity() {

        System.out.println("Fishes in the pond: " + this.fishes.size());
    }

    public void lostFish(Fish fish) {

        if (fishes.size() == 0) {
            System.out.println("*****The pond is empty!*****");
        }
        if (fishes.contains(fish)) {
            fishes.remove(fish);
            this.power -= 2;
            System.out.println("*****You catch the fish.*****");
        }

        if (fish instanceof Carp) {
            fishes.remove(fish);
            this.power -= 2;
            System.out.println("*****You catch the fish.*****");
        } else if (fish instanceof SheatFish) {
            fishes.remove(fish);
            this.power -= 2;
            System.out.println("*****You catch the fish.*****");
        } else {
            System.out.println("The fish does not exist!");
        }
    }

    public void obtainFish(Fish fish) {

        if (fish instanceof Carp) {
            fishes.add(fish);
            this.power++;
            System.out.println("*****You add a new carp in your pond!*****");

        }
        if (fish instanceof SheatFish) {
            fishes.add(fish);
            this.power++;
            System.out.println("*****You add a new sheatFish in your pond!*****");
        }
    }
}




