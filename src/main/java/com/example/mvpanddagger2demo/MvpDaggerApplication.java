package com.example.mvpanddagger2demo;

import android.app.Application;

import com.example.mvpanddagger2demo.daggerComponent.AppComponent;
import com.example.mvpanddagger2demo.daggerComponent.AppModule;
import com.example.mvpanddagger2demo.daggerComponent.DaggerAppComponent;


/**
 * Created by user on 18-1-15.
 */

public class MvpDaggerApplication extends Application {


    private AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        getAppComponent().inject(this);
    }

    public AppComponent getAppComponent(){
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        }
        return appComponent;
    }
}
