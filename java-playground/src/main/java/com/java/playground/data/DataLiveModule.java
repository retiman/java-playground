package com.java.playground.data;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;


public final class DataLiveModule extends AbstractModule {
  @Override
  public void configure() {
    bind(String.class).annotatedWith(Data.class).toInstance("dice_proddb");
    bind(Database.class).to(RealDatabase.class).in(Singleton.class);
  }
}
