package app.memory;

import java.util.Comparator;

/**
 * Created by Austin on 11/4/2017.
 */

// Not used because it did not work as intended, but we'll keep it to try and fix it at a later date

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
