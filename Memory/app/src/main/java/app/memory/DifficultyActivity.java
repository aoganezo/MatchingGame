package app.memory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DifficultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        Button two_ez_button = (Button) findViewById(R.id.two_ez_button);
        Button ez_button = (Button) findViewById(R.id.ez_button);
        Button not_ez_button = (Button) findViewById(R.id.not_ez_button);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i("test","to game play");
                Button button = (Button) v;
                Intent to_gameplay = new Intent(DifficultyActivity.this, GamePlay.class);
                to_gameplay.putExtra("mode", button.getText().toString());
                startActivity(to_gameplay);
            }
        };

        two_ez_button.setOnClickListener(listener);
        ez_button.setOnClickListener(listener);
        not_ez_button.setOnClickListener(listener);

    }

}