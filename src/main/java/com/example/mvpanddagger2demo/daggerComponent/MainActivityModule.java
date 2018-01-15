package com.example.mvpanddagger2demo.daggerComponent;

import com.example.mvpanddagger2demo.view.IViewListener;

import dagger.Module;
import dagger.Provides;

/**
 * Created by user on 18-1-15.
 */
@MainActivityScope
@Module
public class MainActivityModule {

    IViewListener viewListener;

    public MainActivityModule(IViewListener viewListener) {
        this.viewListener = viewListener;
    }

    @MainActivityScope
    @Provides
    IViewListener provideViewListener(){
        return viewListener;
    }

}
