package app.memory;

import java.util.Comparator;

/**
 * Created by safea on 10/31/2017.
 */

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


