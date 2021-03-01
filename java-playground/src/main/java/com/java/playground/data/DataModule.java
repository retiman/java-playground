package com.java.playground.data;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;


public final class DataModule extends AbstractModule {
  @Override
  public void configure() {
    requireBinding(Database.class);

    bind(UserManager.class).to(RealUserManager.class).in(Singleton.class);
  }
}
