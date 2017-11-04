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
import java.util.logging.Handler;

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
            //Log.i("test", "test1, gameplay, gridview created");
            int theCard;
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.iv1:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv2:
                        int theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv3:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv4:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv5:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv6:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv7:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv8:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv9:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv10:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv11:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                    case R.id.iv12:
                        theCard = Integer.parseInt((String) gridView.getTag());
                        flipCard(iv1, theCard);
                        break;
                }

            }
        };
    }

    private void flipCard(ImageView iv, int card) {
        if (imageIds[card] == 101) {
            iv.setImageResource(img01);
        } else if (imageIds[card] == 102) {
            iv.setImageResource(img02);
        } else if (imageIds[card] == 103) {
            iv.setImageResource(img03);
        } else if (imageIds[card] == 104) {
            iv.setImageResource(img04);
        } else if (imageIds[card] == 105) {
            iv.setImageResource(img05);
        } else if (imageIds[card] == 106) {
            iv.setImageResource(img06);
        } else if (imageIds[card] == 107) {
            iv.setImageResource(img07);
        } else if (imageIds[card] == 108) {
            iv.setImageResource(img08);
        } else if (imageIds[card] == 109) {
            iv.setImageResource(img09);
        } else if (imageIds[card] == 110) {
            iv.setImageResource(img11);
        } else if (imageIds[card] == 111) {
            iv.setImageResource(img11);
        } else if (imageIds[card] == 112) {
            iv.setImageResource(img12);
        }


        //check which image is selected and save it to temp var
        if (cardNumber == 1) {
            firstCard = imageIds[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = imageIds[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv1.setEnabled(false);
            iv2.setEnabled(false);
            iv3.setEnabled(false);
            iv4.setEnabled(false);
            iv5.setEnabled(false);
            iv6.setEnabled(false);
            iv7.setEnabled(false);
            iv8.setEnabled(false);
            iv9.setEnabled(false);
            iv10.setEnabled(false);
            iv11.setEnabled(false);
            iv12.setEnabled(false);

//            Handler handler = new Handler();
//            Handler
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    calculate();
//                }
//            }
//        }, 1000);
//

    }}

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