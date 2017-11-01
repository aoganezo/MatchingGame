package app.memory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start_button = (Button) findViewById(R.id.start_button);
        Button leaderboard_button = (Button) findViewById(R.id.leaderboard_button);

        View.OnClickListener start_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent to_difficulty = new Intent(MainActivity.this, DifficultyActivity.class);
                startActivity(to_difficulty);
            }
        };

        View.OnClickListener leaderboard_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent to_leaderboard = new Intent(MainActivity.this, LeaderboardActivity.class);
                startActivity(to_leaderboard);
            }
        };

        start_button.setOnClickListener(start_listener);
        leaderboard_button.setOnClickListener(leaderboard_listener);


    }
}
