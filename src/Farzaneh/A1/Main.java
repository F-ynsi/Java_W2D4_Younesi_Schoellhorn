package Farzaneh.A1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Male male01 = new Male();
        Male male02 = new Male();

        Female female01 = new Female();
        Female female02 = new Female();

        ArrayList < Human > humanArray = new ArrayList < Human > ();

        humanArray.add(male01);
        humanArray.add(male02);
        humanArray.add(female01);
        humanArray.add(female02);

        for (Human element: humanArray) {
            element.getChromosomes();
        }



    }
}
