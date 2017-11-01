package app.memory;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.content.Intent;

import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class GamePlay extends AppCompatActivity {
    GridView gridView;

    String[] values = {
            "Hippo",
            "Hippo",
            "Hippo",
            "Hippo",
            "Hippo",
            "Hippo",
    };

    int[] images = {
            R.drawable.hippo,
            R.drawable.hippo,
            R.drawable.hippo,
            R.drawable.hippo,
            R.drawable.hippo,
            R.drawable.hippo,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);

        /*int size;

        Intent intent = getIntent();
        final String mode = intent.getStringExtra("mode");
        Log.i("test", "test1, gameplay, before size check");

        if (mode == "2ez") {
            Log.i("test", "test1, gameplay, size=10");
            size = 10;
        }
        else if (mode == "ez") {
            Log.i("test", "test1, gameplay, size=16");
            size = 16;
        }
        else if (mode == "not ez") {
            Log.i("test", "test1, gameplay, size=24");
            size = 24;
        }
        else {
            Log.i("test", "test1, gameplay, size=error");
            size = 0;
        }*/

        gridView = (GridView) findViewById(R.id.gridview);
        Log.i("test", "test1, gameplay, gridview created");
        ImageAdapter gridAdapter = new ImageAdapter(this, values, images);
        gridView.setAdapter(gridAdapter);
//
//        gridView.setOnItemClickListener(new OnItemClickListener() {
//            public void onItemClick(AdapterView<?> parent,
//                                    View v, int position, long id){
//                // Send intent to SingleViewActivity
//                Intent i = new Intent(getApplicationContext(), SingleViewActivity.class);
//                // Pass image index
//                i.putExtra("id", position);
//                startActivity(i);
//            }
//        });







    }

}