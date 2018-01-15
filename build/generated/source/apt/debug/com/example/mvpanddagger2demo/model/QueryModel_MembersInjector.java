package com.example.mvpanddagger2demo.model;

import android.content.Context;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QueryModel_MembersInjector implements MembersInjector<QueryModel> {
  private final Provider<Context> globalContextProvider;

  public QueryModel_MembersInjector(Provider<Context> globalContextProvider) {
    assert globalContextProvider != null;
    this.globalContextProvider = globalContextProvider;
  }

  public static MembersInjector<QueryModel> create(Provider<Context> globalContextProvider) {
    return new QueryModel_MembersInjector(globalContextProvider);
  }

  @Override
  public void injectMembers(QueryModel instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.globalContext = globalContextProvider.get();
  }
}
