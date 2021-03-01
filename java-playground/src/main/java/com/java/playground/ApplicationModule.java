package com.java.playground;

import com.google.inject.AbstractModule;
import com.java.playground.api.ApiModule;
import com.java.playground.config.ConfigModule;
import com.java.playground.data.DataModule;
import com.java.playground.dice.DiceModule;


public final class ApplicationModule extends AbstractModule {
  public void configure() {
    install(new ApiModule());
    install(new ConfigModule());
    install(new DataModule());
    install(new DiceModule());
  }
}
