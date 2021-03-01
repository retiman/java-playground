package com.java.playground.api;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;


public final class ApiModule extends AbstractModule {
  @Override
  public void configure() {
    bind(DiceGameResource.class).to(RealDiceGameResource.class).in(Singleton.class);
  }
}
