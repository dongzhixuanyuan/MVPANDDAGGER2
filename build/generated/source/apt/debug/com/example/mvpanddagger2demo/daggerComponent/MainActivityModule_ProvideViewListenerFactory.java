package com.example.mvpanddagger2demo.daggerComponent;

import com.example.mvpanddagger2demo.view.IViewListener;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivityModule_ProvideViewListenerFactory implements Factory<IViewListener> {
  private final MainActivityModule module;

  public MainActivityModule_ProvideViewListenerFactory(MainActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public IViewListener get() {
    return Preconditions.checkNotNull(
        module.provideViewListener(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IViewListener> create(MainActivityModule module) {
    return new MainActivityModule_ProvideViewListenerFactory(module);
  }
}
