package com.noobswe.kphai.mvcstructure.activity;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.noobswe.kphai.mvcstructure.R;
import com.noobswe.kphai.mvcstructure.fragment.MainFragment;
import com.noobswe.kphai.mvcstructure.util.ScreenUtils;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int screenWidth = ScreenUtils.getInstance().getScreenWidth();
        int screenHeight = ScreenUtils.getInstance().getScreenHeight();

        Toast.makeText(MainActivity.this,
                "Width " + screenWidth +
                        "Height " + screenHeight, Toast.LENGTH_SHORT).show();


        if (savedInstanceState == null) {
            // First Create
            //Place Fragment here
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MainFragment.newInstance(123), "MainFragment")
                    .commit();


        }

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (savedInstanceState == null) {
            MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentByTag("MainFragment");
            mainFragment.setHelloText("Woo Hooooooooooooooo");
        }
    }
}
