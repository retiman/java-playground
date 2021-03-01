package com.java.playground.api;

import javax.inject.Inject;

import com.java.playground.data.Database;


final class RealDiceGameResource implements DiceGameResource {
  @Inject
  RealDiceGameResource(Database database) {
  }
}
