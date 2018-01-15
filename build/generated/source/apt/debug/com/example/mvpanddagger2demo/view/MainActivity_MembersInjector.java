package com.example.mvpanddagger2demo.view;

import android.content.Context;
import com.example.mvpanddagger2demo.presenter.QueryPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Context> globalContextProvider;

  private final Provider<QueryPresenter> presenterProvider;

  public MainActivity_MembersInjector(
      Provider<Context> globalContextProvider, Provider<QueryPresenter> presenterProvider) {
    assert globalContextProvider != null;
    this.globalContextProvider = globalContextProvider;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<Context> globalContextProvider, Provider<QueryPresenter> presenterProvider) {
    return new MainActivity_MembersInjector(globalContextProvider, presenterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.globalContext = globalContextProvider.get();
    instance.presenter = presenterProvider.get();
  }
}
