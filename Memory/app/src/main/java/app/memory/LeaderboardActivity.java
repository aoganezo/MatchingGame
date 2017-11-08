package app.memory;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;


public class LeaderboardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);


        Intent intent = getIntent();

        int score = intent.getIntExtra("score", 0);

        Button home = (Button) findViewById(R.id.home_button);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent to_home = new Intent(LeaderboardActivity.this, MainActivity.class);
                startActivity(to_home);
            }
        });

        TextView score1_tv = (TextView) findViewById(R.id.score1_tv);
        TextView score2_tv = (TextView) findViewById(R.id.score2_tv);
        TextView score3_tv = (TextView) findViewById(R.id.score3_tv);
        TextView score4_tv = (TextView) findViewById(R.id.score4_tv);
        TextView score5_tv = (TextView) findViewById(R.id.score5_tv);

        if (score == 0) {

            GlobalArrayList scores = GlobalArrayList.getInstance();
            scores.sort();

            if (scores.size() == 1)
                score1_tv.setText(scores.get(0).toString());
            else if (scores.size() == 2) {
                score1_tv.setText(scores.get(0).toString());
                score2_tv.setText(scores.get(1).toString());
            }
            else if (scores.size() == 3) {
                score1_tv.setText(scores.get(0).toString());
                score2_tv.setText(scores.get(1).toString());
                score3_tv.setText(scores.get(2).toString());
            }
            else if (scores.size() == 4) {
                score1_tv.setText(scores.get(0).toString());
                score2_tv.setText(scores.get(1).toString());
                score3_tv.setText(scores.get(2).toString());
                score4_tv.setText(scores.get(3).toString());
            }
            else if (scores.size() >= 5) {
                score1_tv.setText(scores.get(0).toString());
                score2_tv.setText(scores.get(1).toString());
                score3_tv.setText(scores.get(2).toString());
                score4_tv.setText(scores.get(3).toString());
                score5_tv.setText(scores.get(4).toString());
            }

        } else {

            //GlobalArrayList initiation

            GlobalArrayList scores = GlobalArrayList.getInstance();
            scores.add(score);
            scores.sort();

            //TextViews

            //Adding the sores to the leaderboard


            if (scores.size() == 1)
                score1_tv.setText(scores.get(0).toString());
            else if (scores.size() == 2) {
                score1_tv.setText(scores.get(0).toString());
                score2_tv.setText(scores.get(1).toString());
            }
            else if (scores.size() == 3) {
                score1_tv.setText(scores.get(0).toString());
                score2_tv.setText(scores.get(1).toString());
                score3_tv.setText(scores.get(2).toString());
            }
            else if (scores.size() == 4) {
                score1_tv.setText(scores.get(0).toString());
                score2_tv.setText(scores.get(1).toString());
                score3_tv.setText(scores.get(2).toString());
                score4_tv.setText(scores.get(3).toString());
            }
            else if (scores.size() >= 5) {
                score1_tv.setText(scores.get(0).toString());
                score2_tv.setText(scores.get(1).toString());
                score3_tv.setText(scores.get(2).toString());
                score4_tv.setText(scores.get(3).toString());
                score5_tv.setText(scores.get(4).toString());
            }



        }
    }


}
