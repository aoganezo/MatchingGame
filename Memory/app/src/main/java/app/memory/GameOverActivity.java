package app.memory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        Intent intent = getIntent();
        final int final_score = intent.getIntExtra("final_score", 0);
        TextView final_score_tv = (TextView) findViewById(R.id.final_score_tv);

        final_score_tv.setText(final_score + "");

        Button to_leaderboard_button = (Button) findViewById(R.id.leaderboard_button_2);

        to_leaderboard_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent to_leaderboard = new Intent(GameOverActivity.this, LeaderboardActivity.class);
                to_leaderboard.putExtra("score", final_score);
                startActivity(to_leaderboard);
            }
        });


    }
}
