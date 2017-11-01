package app.memory;

import android.content.Context;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private final String [] values;
    private final int [] images;
    View view;
    LayoutInflater layoutInflater;

    public ImageAdapter(Context mContext, String[] values, int[] images) {
        this.mContext = mContext;
        this.values = values;
        this.images = images;
    }

    // Constructor
//    public ImageAdapter(Context c) {
//        mContext = c;
//    }
    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        //ImageView imageView;
        layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Log.i("test", "test2, gameplay, getView");
        if (convertView == null) {
            Log.i("test", "test2, gameplay, convertView is Null");
            view = new View(mContext);
            view = layoutInflater.inflate(R.layout.activity_game_play, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
            TextView tv = (TextView) view.findViewById(R.id.textView);
            imageView.setImageResource(images[position]);
            tv.setText(values[position]);
        }
        return view;
    }

    // Keep all Images in array
//    public Integer[] mThumbIds = {
//            R.drawable.hippo, R.drawable.hippo,
//            R.drawable.hippo, R.drawable.hippo//,
//            R.drawable.sample_6, R.drawable.sample_7,
//            R.drawable.sample_0, R.drawable.sample_1,
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7,
//            R.drawable.sample_0, R.drawable.sample_1,
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7
//    };
}