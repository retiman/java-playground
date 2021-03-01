package com.java.playground.dice;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;


public final class DiceModule extends AbstractModule {
  @Override
  public void configure() {
    install(new FactoryModuleBuilder()
        .implement(DiceManager.class, RealDiceManager.class)
        .build(DiceManager.Factory.class));

    bind(DiceGame.class).to(RealDiceGame.class).in(Singleton.class);
  }
}
