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
import android.widget.ImageView;
import android.widget.TextView;

import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collections;

public class GamePlay extends AppCompatActivity {
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12;
    GridView gridView;
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;
    TextView score;
    Integer[] imageIds = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112};
    int img01, img02, img03, img04, img05, img06, img07, img08, img09, img10, img11, img12;

    /*String[] values = {
            "Hippo",
            "Hippo",
            "Hippo",
            "Hippo",
            "Hippo",
            "Hippo",
    };*/

    /*int[] images = {
            R.drawable.hippo,
            R.drawable.hippo,
            R.drawable.hippo,
            R.drawable.hippo,
            R.drawable.hippo,
            R.drawable.hippo,
    };*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);


        /*
        int size;

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
        }
        */

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);
        iv5 = (ImageView) findViewById(R.id.iv5);
        iv6 = (ImageView) findViewById(R.id.iv6);
        iv7 = (ImageView) findViewById(R.id.iv7);
        iv8 = (ImageView) findViewById(R.id.iv8);
        iv9 = (ImageView) findViewById(R.id.iv9);
        iv10 = (ImageView) findViewById(R.id.iv10);
        iv11 = (ImageView) findViewById(R.id.iv11);
        iv12 = (ImageView) findViewById(R.id.iv12);

        score = (TextView) findViewById(R.id.score);

        iv1.setTag("0");
        iv1.setTag("1");
        iv1.setTag("2");
        iv1.setTag("3");
        iv1.setTag("4");
        iv1.setTag("5");
        iv1.setTag("6");
        iv1.setTag("7");
        iv1.setTag("8");
        iv1.setTag("9");
        iv1.setTag("10");
        iv1.setTag("11");


        frontOfCardResources();

        Collections.shuffle(Arrays.asList(imageIds));

        View.OnClickListener imageClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
    }
    private void frontOfCardResources() {

        img01 = R.drawable.hippo;
        img02 = R.drawable.hippo;
        img03 = R.drawable.hippo;
        img04 = R.drawable.hippo;
        img05 = R.drawable.hippo;
        img06 = R.drawable.hippo;
        img07 = R.drawable.hippo;
        img08 = R.drawable.hippo;
        img09 = R.drawable.hippo;
        img10 = R.drawable.hippo;
        img11 = R.drawable.hippo;
        img12 = R.drawable.hippo;

    }







//        Log.i("test", "test1, gameplay, gridview created");
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