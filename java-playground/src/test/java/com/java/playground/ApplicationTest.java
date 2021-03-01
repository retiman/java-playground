package com.java.playground;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.java.playground.testing.ApplicationTestModule;
import org.junit.jupiter.api.Test;


public final class ApplicationTest {
  @Test
  public void testRealApplication() {
    // Guice does not allow overriding of bindings
    Injector injector = Guice.createInjector(
        new ApplicationModule(),
        new ApplicationLiveModule());
  }

  @Test
  public void testFakeApplication() {
    // Guice does not allow overriding of bindings
    Injector injector = Guice.createInjector(
        new ApplicationModule(),
        new ApplicationTestModule());
  }
}
