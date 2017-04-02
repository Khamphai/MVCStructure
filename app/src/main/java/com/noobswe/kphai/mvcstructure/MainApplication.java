package com.noobswe.kphai.mvcstructure;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by K'Phai on 2/9/2016.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Initialize thing(s) here
        Contextor.getInstance().init(getApplicationContext());

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
