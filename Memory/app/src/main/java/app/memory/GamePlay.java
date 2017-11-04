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

        ImageView iv1 = (ImageView) findViewById(R.id.iv1);
        ImageView iv2 = (ImageView) findViewById(R.id.iv2);
        ImageView iv3 = (ImageView) findViewById(R.id.iv3);
        ImageView iv4 = (ImageView) findViewById(R.id.iv4);
        ImageView iv5 = (ImageView) findViewById(R.id.iv5);
        ImageView iv6 = (ImageView) findViewById(R.id.iv6);
        ImageView iv7 = (ImageView) findViewById(R.id.iv7);
        ImageView iv8 = (ImageView) findViewById(R.id.iv8);
        ImageView iv9 = (ImageView) findViewById(R.id.iv9);
        ImageView iv10 = (ImageView) findViewById(R.id.iv10);
        ImageView iv11 = (ImageView) findViewById(R.id.iv11);
        ImageView iv12 = (ImageView) findViewById(R.id.iv12);

        Integer imageIds = {00, 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12};

        int firstCard, secondCard;
        int clickedFirst, clickedSecond;
        int cardNumber = 1;

        int turn = 1;

        TextView score = (TextView) findViewById(R.id.score);

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


    }
    private void frontOfCardResources() {
        int img01, img02, img03, img04, img05, img06, img07, img08, img09, img10, img11, img12;
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






//
        Log.i("test", "test1, gameplay, gridview created");
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