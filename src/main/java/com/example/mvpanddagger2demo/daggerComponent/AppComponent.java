package com.example.mvpanddagger2demo.daggerComponent;

import android.content.Context;

import com.example.mvpanddagger2demo.MvpDaggerApplication;

import dagger.Component;

/**
 * Created by user on 18-1-15.
 */
@AppScope
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MvpDaggerApplication application);

    Context getContext();//if some component depends on appcomponent,and want to get the context
}
