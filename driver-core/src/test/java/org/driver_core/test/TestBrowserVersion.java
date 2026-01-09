package org.driver_core.test;

import org.driver_core.core.browserVersion.ChromeBrowserVersion;
import org.junit.Test;

public class TestBrowserVersion {
    @Test
    public void testBrowserVersion(){
      ChromeBrowserVersion browserVersion =
          new ChromeBrowserVersion();
      System.out.println(browserVersion.getBrowserVersion());
    }
}
