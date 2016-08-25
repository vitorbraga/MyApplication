package br.com.myapplication;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.model.ImageItem;

public class CarteActivity extends AppCompatActivity {

    private GridView mGridview;

    private GridViewAdapter mGridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carte);

        mGridview = (GridView) findViewById(R.id.carte_gridview);
        mGridAdapter = new GridViewAdapter(this, R.layout.grid_item_layout, getData());
        mGridview.setAdapter(mGridAdapter);
    }

    private ArrayList<ImageItem> getData() {
        final ArrayList<ImageItem> imageItems = new ArrayList<>();
        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
        for (int i = 0; i < imgs.length(); i++) {
//            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
            imageItems.add(new ImageItem(imgs.getResourceId(i, -1), "Image#" + i));
        }

        return imageItems;
    }

}
