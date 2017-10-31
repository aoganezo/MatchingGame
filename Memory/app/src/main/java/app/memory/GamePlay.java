package app.memory;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

public class GamePlay extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);

        int size;

        Intent intent = getIntent();
        final String mode = intent.getStringExtra("mode");


        if (mode == "2ez") {
            size = 10;
        }
        else if (mode == "ez") {
            size = 16;
        }
        else if (mode == "not ez") {
            size = 24;
        }
        else {
            size = 0;
        }

//        for (int i = 0; i < size; i++) {
//            ImageView aView = new ImageView();
//
//        }






    }

}