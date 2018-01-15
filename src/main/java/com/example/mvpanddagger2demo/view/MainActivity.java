package com.example.mvpanddagger2demo.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.mock.MockApplication;
import android.view.View;
import android.widget.Toast;

import com.example.mvpanddagger2demo.MvpDaggerApplication;
import com.example.mvpanddagger2demo.R;
import com.example.mvpanddagger2demo.daggerComponent.DaggerMainActivityComponent;
import com.example.mvpanddagger2demo.daggerComponent.MainActivityModule;
import com.example.mvpanddagger2demo.presenter.QueryPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IViewListener,View.OnClickListener{


    @Inject
    public Context globalContext;

    @Inject
    public QueryPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder().appComponent(((MvpDaggerApplication) getApplication()).getAppComponent()).mainActivityModule(new MainActivityModule(this)).build().inject(this);
        findViewById(R.id.testAsk).setOnClickListener(this);
    }

    @Override
    public void afterAsk(String question) {
        Toast.makeText(globalContext,"view 收到了question",Toast.LENGTH_SHORT).show();
    }

    public void testAsker(View view) {
        presenter.startAsk();
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.testAsk){
            testAsker(v);
        }
    }
}
