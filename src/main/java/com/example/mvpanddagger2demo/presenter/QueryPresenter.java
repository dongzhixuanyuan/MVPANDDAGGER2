package com.example.mvpanddagger2demo.presenter;

import com.example.mvpanddagger2demo.model.IQueryListenr;
import com.example.mvpanddagger2demo.model.QueryModel;
import com.example.mvpanddagger2demo.view.IViewListener;

import javax.inject.Inject;

/**
 * Created by user on 18-1-15.
 */

public class QueryPresenter {

    IQueryListenr modelQueryListener;

    @Inject
    IViewListener viewQueryListener;

    @Inject
    public QueryModel queryModel;

    @Inject
    public QueryPresenter(IViewListener viewQueryListener, QueryModel queryModel) {
        this.modelQueryListener = queryModel;
        this.queryModel = queryModel;
        this.viewQueryListener = viewQueryListener;
    }

    public void startAsk(){
        String question = "测试问题";
        queryModel.ask(question);
        viewQueryListener.afterAsk(question);
        queryModel.afterAsk(question);

    }

}
