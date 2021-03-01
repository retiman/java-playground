package com.java.playground.testing;

import com.google.inject.AbstractModule;
import com.java.playground.data.testing.DataTestModule;
import com.java.playground.lifecycle.LifecycleTestModule;


public final class ApplicationTestModule extends AbstractModule {
  @Override
  public void configure() {
    install(new DataTestModule());
    install(new LifecycleTestModule());
  }
}
