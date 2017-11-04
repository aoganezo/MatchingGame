package app.memory;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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


        //scores.add(score);

        Collections.sort(scores, Collections.reverseOrder());


        //TextViews

        TextView score1_tv = (TextView) findViewById(R.id.score1_tv);
        TextView score2_tv = (TextView) findViewById(R.id.score2_tv);
        TextView score3_tv = (TextView) findViewById(R.id.score3_tv);
        TextView score4_tv = (TextView) findViewById(R.id.score4_tv);
        TextView score5_tv = (TextView) findViewById(R.id.score5_tv);

        if (scores.size() == 1)
            score1_tv.setText(scores.get(0).toString());
        if (scores.size() == 2) {
            score1_tv.setText(scores.get(0).toString());
            score2_tv.setText(scores.get(1).toString());
        }
        if (scores.size() == 3){
            score1_tv.setText(scores.get(0).toString());
            score2_tv.setText(scores.get(1).toString());
            score3_tv.setText(scores.get(2).toString());
        }
        if (scores.size() == 4) {
            score1_tv.setText(scores.get(0).toString());
            score2_tv.setText(scores.get(1).toString());
            score3_tv.setText(scores.get(2).toString());
            score4_tv.setText(scores.get(3).toString());
        }
        if (scores.size() == 5){
            score1_tv.setText(scores.get(0).toString());
            score2_tv.setText(scores.get(1).toString());
            score3_tv.setText(scores.get(2).toString());
            score4_tv.setText(scores.get(3).toString());
            score5_tv.setText(scores.get(4).toString());
        }
        if (scores.size() >= 5){
            score1_tv.setText(scores.get(0).toString());
            score2_tv.setText(scores.get(1).toString());
            score3_tv.setText(scores.get(2).toString());
            score4_tv.setText(scores.get(3).toString());
            score5_tv.setText(scores.get(4).toString());
            scores.remove(6);
        }

        Button home = (Button) findViewById(R.id.home_button);

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent to_home = new Intent(LeaderboardActivity.this, MainActivity.class);
                startActivity(to_home);
            }
        });
        /*


        scores.add(new Tuple(name, score));
        TupleComparator comparator = new TupleComparator();
        Collections.sort(scores, comparator);

        Tuple goof = new Tuple ("yay", 12);
        Tuple gaff = new Tuple ("yoy", 4);
        Tuple oof = new Tuple ("drearj", 134314143);

        scores.add(goof);
        scores.add(gaff);
        scores.add(oof);

        scores.add(new Tuple("test", 15));

        Log.i("test", "here1" + score + "");


        //TextViews
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

        /*

        Context context = getApplicationContext();
        CharSequence test = name;
        int length = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, goof.getScore() + "\n"+ goof.getName(), length);
        toast.show();




        Tuple tuple_two = (Tuple) scores.get(0);
        score1_tv.setText(tuple_two.getScore() + "");
        name1_tv.setText(tuple_two.getScore()+"");

        Tuple tuple_three = (Tuple) scores.get(1);
        score2_tv.setText(tuple_three.getScore() + "");
        name2_tv.setText(tuple_three.getName() + "");

        Tuple tuple_four = (Tuple) scores.get(2);
        score3_tv.setText(tuple_four.getScore() + "");
        name3_tv.setText(tuple_four.getScore()+"");

        Tuple tuple_five = (Tuple) scores.get(3);
        score4_tv.setText(tuple_five.getScore() + "");
        name4_tv.setText(tuple_five.getName() + "");


        */
    }
}
