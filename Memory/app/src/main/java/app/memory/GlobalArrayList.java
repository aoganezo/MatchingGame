package app.memory;

import android.app.Application;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Austin on 11/6/2017.
 */

/*
    This is a custom class that acts as a global array list, so the scores are saved from multiple games.

 */

public class GlobalArrayList extends Application {
    private ArrayList scoreList;

    public GlobalArrayList(){
        scoreList = new ArrayList();
    }

    public void sort(){
        Collections.sort(scoreList);
    }

    public int size(){
        return scoreList.size();
    }

    public Object get(int position){
        return scoreList.get(position);
    }

    public void remove(int position){
        scoreList.remove(position);
    }

    public void add(Object o){
        scoreList.add(o);
    }

    private static GlobalArrayList instance;

    public static GlobalArrayList getInstance(){
        if (instance == null) instance = new GlobalArrayList();
        return instance;
    }
}