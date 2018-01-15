package com.example.mvpanddagger2demo.model;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by user on 18-1-15.
 */

public class QueryModel implements IQueryListenr {

    private String question;


    @Inject
    public Context globalContext;

    @Inject
    public QueryModel() {
    }

    public void ask(String question){
        Toast.makeText(globalContext,question,Toast.LENGTH_LONG).show();
    }

    @Override
    public void afterAsk(String question) {
        Toast.makeText(globalContext,question,Toast.LENGTH_SHORT).show();
    }
}
