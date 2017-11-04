package app.memory;

/**
 * Created by safea on 10/31/2017.
 */

public class Tuple implements Comparable<Tuple> {

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

    public int compareTo(Tuple that){
        return Integer.compare(this.getScore(), that.getScore());
    }
}


