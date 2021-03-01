package com.java.playground;

import com.google.inject.AbstractModule;
import com.java.playground.data.DataLiveModule;
import com.java.playground.lifecycle.LifecycleLiveModule;


public final class ApplicationLiveModule extends AbstractModule {
  @Override
  public void configure() {
    install(new DataLiveModule());
    install(new LifecycleLiveModule());
  }
}
