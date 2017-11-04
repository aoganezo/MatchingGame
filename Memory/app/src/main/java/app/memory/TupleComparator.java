package app.memory;

import java.util.Comparator;

/**
 * Created by safea on 11/4/2017.
 */

public class TupleComparator implements Comparator<Tuple> {

    @Override
    public int compare(Tuple a, Tuple b){
        if (a.getScore() > b.getScore()){
            return 1;
        }
        else if (a.getScore() == b.getScore()){
            return 0;
        }
        else{
            return -1;
        }
    }

}
