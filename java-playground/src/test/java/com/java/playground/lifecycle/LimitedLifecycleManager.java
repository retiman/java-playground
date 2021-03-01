package com.java.playground.lifecycle;

import com.java.playground.data.Database;


final class LimitedLifecycleManager implements LifecycleManager {
  private final Database database;

  LimitedLifecycleManager(Database database) {
    this.database = database;
  }

  @Override
  public void start() {
    // Populate database with some dummy data
  }
}
