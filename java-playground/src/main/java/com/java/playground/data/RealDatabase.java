package com.java.playground.data;

import javax.inject.Inject;


final class RealDatabase implements Database {
  @Inject
  RealDatabase(@Data String databaseName) {
  }
}
