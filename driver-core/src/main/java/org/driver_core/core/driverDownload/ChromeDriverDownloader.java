package org.driver_core.core.driverDownload;

import org.driver_core.api.BrowserVersion;
import org.driver_core.api.DriverDownloader;
import org.driver_core.core.browserVersion.ChromeBrowserVersion;

public class ChromeDriverDownloader implements DriverDownloader {
  private final BrowserVersion chromeBrowserVersion =
      new ChromeBrowserVersion();
  @Override
  public void download() {
     String version = chromeBrowserVersion.getBrowserVersion();

  }
}
