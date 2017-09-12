package com.pug3eye.mvc_template.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pug3eye.mvc_template.R;
import com.pug3eye.mvc_template.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MainFragment.newInstance())
                    .commit();
        }
    }
}
