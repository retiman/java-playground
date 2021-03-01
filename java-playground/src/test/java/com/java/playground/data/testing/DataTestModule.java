package com.java.playground.data.testing;

import com.google.inject.AbstractModule;
import com.java.playground.data.Data;
import com.java.playground.data.Database;


public final class DataTestModule extends AbstractModule {
  @Override
  public void configure() {
    bind(String.class).annotatedWith(Data.class).toInstance("dice_testdb");
    bind(Database.class).to(InMemoryDatabase.class).asEagerSingleton();
  }
}
