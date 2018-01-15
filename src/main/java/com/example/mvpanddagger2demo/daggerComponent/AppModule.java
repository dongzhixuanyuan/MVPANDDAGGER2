package com.example.mvpanddagger2demo.daggerComponent;

import android.content.Context;

import javax.inject.Scope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by user on 18-1-15.
 */
@Module
public class AppModule {

    Context globalContext;

    public AppModule(Context globalContext) {
        this.globalContext = globalContext;
    }

    @AppScope
    @Provides
    Context provideApplicationContext() {
        return globalContext;
    }
}
