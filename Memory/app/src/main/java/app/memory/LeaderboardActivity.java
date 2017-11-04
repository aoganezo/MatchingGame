package app.memory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;



public class LeaderboardActivity extends AppCompatActivity {

    ArrayList scores = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int score = intent.getIntExtra("score", 0);

        scores.add(new Tuple(name, score));
        Collections.sort(scores);

        //TextView
        TextView score1_tv = (TextView) findViewById(R.id.score1_tv);
        TextView score2_tv = (TextView) findViewById(R.id.score2_tv);
        TextView score3_tv = (TextView) findViewById(R.id.score3_tv);
        TextView score4_tv = (TextView) findViewById(R.id.score4_tv);
        TextView score5_tv = (TextView) findViewById(R.id.score5_tv);

        TextView name1_tv = (TextView) findViewById(R.id.name1_tv);
        TextView name2_tv = (TextView) findViewById(R.id.name2_tv);
        TextView name3_tv = (TextView) findViewById(R.id.name3_tv);
        TextView name4_tv = (TextView) findViewById(R.id.name4_tv);
        TextView name5_tv = (TextView) findViewById(R.id.name5_tv);

        Tuple tuple_one = (Tuple) scores.get(0);
        score1_tv.setText(tuple_one.getScore() + "");
        name1_tv.setText(tuple_one.getName() + "");

        Tuple tuple_two = (Tuple) scores.get(1);
        score2_tv.setText(tuple_two.getScore() + "");
        name2_tv.setText(tuple_two.getScore()+"");

        Tuple tuple_three = (Tuple) scores.get(2);
        score1_tv.setText(tuple_three.getScore() + "");
        name1_tv.setText(tuple_three.getName() + "");

        Tuple tuple_four = (Tuple) scores.get(3);
        score2_tv.setText(tuple_four.getScore() + "");
        name2_tv.setText(tuple_four.getScore()+"");

        Tuple tuple_five = (Tuple) scores.get(4);
        score1_tv.setText(tuple_five.getScore() + "");
        name1_tv.setText(tuple_five.getName() + "");



    }
}
