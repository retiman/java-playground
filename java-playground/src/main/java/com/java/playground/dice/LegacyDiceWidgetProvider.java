package com.java.playground.dice;

import javax.inject.Provider;


final class LegacyDiceWidgetProvider implements Provider<LegacyDiceWidget> {
  @Override
  public LegacyDiceWidget get() {
    return LegacyDiceWidget.create();
  }
}
