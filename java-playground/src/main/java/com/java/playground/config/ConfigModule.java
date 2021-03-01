package com.java.playground.config;

import com.google.inject.AbstractModule;


public final class ConfigModule extends AbstractModule {
  @Override
  public void configure() {
    bind(Config.class).to(RealConfig.class).asEagerSingleton();;
  }
}
