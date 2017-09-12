package com.pug3eye.mvc_template;

import android.app.Application;

import com.pug3eye.mvc_template.manager.Contextor;

/**
 * Created by pug3eye on 12/09/2017.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
