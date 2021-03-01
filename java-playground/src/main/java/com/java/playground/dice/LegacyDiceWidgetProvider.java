package com.java.playground.dice;

import javax.inject.Provider;


final class LegacyDiceWidgetProvider implements Provider<LegacyDiceWidget> {
  // Don't do this; this is wrong.
  // private static LegacyDiceWidget instance;

  @Override
  public LegacyDiceWidget get() {
    // This is WRONG.  Do not do this!  Allow the binding in the module to control scope.  Do not control this in the
    // provider.
    // if (instance == null) {
    //   instance = LegacyDiceWidget.create();
    // }
    //
    // return instance;

    return LegacyDiceWidget.create();
  }
}
