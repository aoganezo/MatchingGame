package app.memory;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;

import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

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

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id){
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(), SingleViewActivity.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });







    }

}