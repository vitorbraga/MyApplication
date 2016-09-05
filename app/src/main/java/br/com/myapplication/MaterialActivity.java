package br.com.myapplication;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MaterialActivity extends Activity {

    private Button mGoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_material);

        mGoButton = (Button) findViewById(R.id.go_button);
        mGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().setExitTransition(new Slide());

                Intent intent = new Intent(getApplicationContext(), TinderActivity.class);
                startActivity(intent,
                        ActivityOptions
                                .makeSceneTransitionAnimation(MaterialActivity.this).toBundle());
            }
        });
    }

    public void onSomeButtonClicked(View view) {


    }
}
