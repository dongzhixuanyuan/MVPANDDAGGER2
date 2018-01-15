package com.example.mvpanddagger2demo.daggerComponent;

import android.content.Context;
import com.example.mvpanddagger2demo.model.QueryModel;
import com.example.mvpanddagger2demo.model.QueryModel_Factory;
import com.example.mvpanddagger2demo.model.QueryModel_MembersInjector;
import com.example.mvpanddagger2demo.presenter.QueryPresenter;
import com.example.mvpanddagger2demo.presenter.QueryPresenter_Factory;
import com.example.mvpanddagger2demo.presenter.QueryPresenter_MembersInjector;
import com.example.mvpanddagger2demo.view.IViewListener;
import com.example.mvpanddagger2demo.view.MainActivity;
import com.example.mvpanddagger2demo.view.MainActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMainActivityComponent implements MainActivityComponent {
  private Provider<Context> getContextProvider;

  private Provider<IViewListener> provideViewListenerProvider;

  private MembersInjector<QueryModel> queryModelMembersInjector;

  private Provider<QueryModel> queryModelProvider;

  private MembersInjector<QueryPresenter> queryPresenterMembersInjector;

  private Provider<QueryPresenter> queryPresenterProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private DaggerMainActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getContextProvider =
        new Factory<Context>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public Context get() {
            return Preconditions.checkNotNull(
                appComponent.getContext(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.provideViewListenerProvider =
        DoubleCheck.provider(
            MainActivityModule_ProvideViewListenerFactory.create(builder.mainActivityModule));

    this.queryModelMembersInjector = QueryModel_MembersInjector.create(getContextProvider);

    this.queryModelProvider = QueryModel_Factory.create(queryModelMembersInjector);

    this.queryPresenterMembersInjector =
        QueryPresenter_MembersInjector.create(provideViewListenerProvider, queryModelProvider);

    this.queryPresenterProvider =
        QueryPresenter_Factory.create(
            queryPresenterMembersInjector, provideViewListenerProvider, queryModelProvider);

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(getContextProvider, queryPresenterProvider);
  }

  @Override
  public void inject(MainActivity mainActivity) {
    mainActivityMembersInjector.injectMembers(mainActivity);
  }

  public static final class Builder {
    private MainActivityModule mainActivityModule;

    private AppComponent appComponent;

    private Builder() {}

    public MainActivityComponent build() {
      if (mainActivityModule == null) {
        throw new IllegalStateException(
            MainActivityModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerMainActivityComponent(this);
    }

    public Builder mainActivityModule(MainActivityModule mainActivityModule) {
      this.mainActivityModule = Preconditions.checkNotNull(mainActivityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
