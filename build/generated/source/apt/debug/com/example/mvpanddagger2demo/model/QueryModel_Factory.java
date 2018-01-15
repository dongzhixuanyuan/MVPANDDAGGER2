package com.example.mvpanddagger2demo.model;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QueryModel_Factory implements Factory<QueryModel> {
  private final MembersInjector<QueryModel> queryModelMembersInjector;

  public QueryModel_Factory(MembersInjector<QueryModel> queryModelMembersInjector) {
    assert queryModelMembersInjector != null;
    this.queryModelMembersInjector = queryModelMembersInjector;
  }

  @Override
  public QueryModel get() {
    return MembersInjectors.injectMembers(queryModelMembersInjector, new QueryModel());
  }

  public static Factory<QueryModel> create(MembersInjector<QueryModel> queryModelMembersInjector) {
    return new QueryModel_Factory(queryModelMembersInjector);
  }
}
