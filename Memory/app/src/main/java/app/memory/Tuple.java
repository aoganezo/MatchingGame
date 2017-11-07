package app.memory;

import java.util.Comparator;

/**
 * Created by Austin on 10/31/2017.
 */

// Not used because it did not work as intended, but we'll keep it to try and fix it at a later date

public class Tuple {

    private String name;
    private int score;

    public Tuple(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

}


