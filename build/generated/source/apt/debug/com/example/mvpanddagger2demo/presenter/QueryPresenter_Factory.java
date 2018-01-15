package com.example.mvpanddagger2demo.presenter;

import com.example.mvpanddagger2demo.model.QueryModel;
import com.example.mvpanddagger2demo.view.IViewListener;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QueryPresenter_Factory implements Factory<QueryPresenter> {
  private final MembersInjector<QueryPresenter> queryPresenterMembersInjector;

  private final Provider<IViewListener> viewQueryListenerProvider;

  private final Provider<QueryModel> queryModelProvider;

  public QueryPresenter_Factory(
      MembersInjector<QueryPresenter> queryPresenterMembersInjector,
      Provider<IViewListener> viewQueryListenerProvider,
      Provider<QueryModel> queryModelProvider) {
    assert queryPresenterMembersInjector != null;
    this.queryPresenterMembersInjector = queryPresenterMembersInjector;
    assert viewQueryListenerProvider != null;
    this.viewQueryListenerProvider = viewQueryListenerProvider;
    assert queryModelProvider != null;
    this.queryModelProvider = queryModelProvider;
  }

  @Override
  public QueryPresenter get() {
    return MembersInjectors.injectMembers(
        queryPresenterMembersInjector,
        new QueryPresenter(viewQueryListenerProvider.get(), queryModelProvider.get()));
  }

  public static Factory<QueryPresenter> create(
      MembersInjector<QueryPresenter> queryPresenterMembersInjector,
      Provider<IViewListener> viewQueryListenerProvider,
      Provider<QueryModel> queryModelProvider) {
    return new QueryPresenter_Factory(
        queryPresenterMembersInjector, viewQueryListenerProvider, queryModelProvider);
  }
}
