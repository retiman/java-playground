package com.java.playground.lifecycle;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;


public final class LifecycleLiveModule extends AbstractModule {
  @Override
  public void configure() {
    bind(LifecycleManager.class).to(RealLifecycleManager.class).in(Singleton.class);
  }
}
