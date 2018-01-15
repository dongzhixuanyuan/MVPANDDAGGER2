package com.example.mvpanddagger2demo.daggerComponent;

import com.example.mvpanddagger2demo.view.MainActivity;

import dagger.Component;

/**
 * Created by user on 18-1-15.
 */
@MainActivityScope
@Component(modules = {MainActivityModule.class},dependencies = {AppComponent.class})
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
