package app.memory;

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
        return name;
    }
    public int getscore(){
        return score;
    }
}
