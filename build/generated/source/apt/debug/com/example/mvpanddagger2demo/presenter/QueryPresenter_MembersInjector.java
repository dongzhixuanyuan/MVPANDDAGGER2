package com.example.mvpanddagger2demo.presenter;

import com.example.mvpanddagger2demo.model.QueryModel;
import com.example.mvpanddagger2demo.view.IViewListener;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QueryPresenter_MembersInjector implements MembersInjector<QueryPresenter> {
  private final Provider<IViewListener> viewQueryListenerProvider;

  private final Provider<QueryModel> queryModelProvider;

  public QueryPresenter_MembersInjector(
      Provider<IViewListener> viewQueryListenerProvider, Provider<QueryModel> queryModelProvider) {
    assert viewQueryListenerProvider != null;
    this.viewQueryListenerProvider = viewQueryListenerProvider;
    assert queryModelProvider != null;
    this.queryModelProvider = queryModelProvider;
  }

  public static MembersInjector<QueryPresenter> create(
      Provider<IViewListener> viewQueryListenerProvider, Provider<QueryModel> queryModelProvider) {
    return new QueryPresenter_MembersInjector(viewQueryListenerProvider, queryModelProvider);
  }

  @Override
  public void injectMembers(QueryPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.viewQueryListener = viewQueryListenerProvider.get();
    instance.queryModel = queryModelProvider.get();
  }

  public static void injectViewQueryListener(
      QueryPresenter instance, Provider<IViewListener> viewQueryListenerProvider) {
    instance.viewQueryListener = viewQueryListenerProvider.get();
  }
}
