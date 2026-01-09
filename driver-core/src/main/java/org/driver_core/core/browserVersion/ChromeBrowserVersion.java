package org.driver_core.core.browserVersion;

import org.driver_core.api.BrowserVersion;
import org.nimbus_exception.system_exception.SystemException;
import org.nimbus_platform.os.OS;
import org.nimbus_platform.os.OSDetector;
import org.nimbus_platform.process.Command;
import org.nimbus_platform.process.ProcessResult;
import org.nimbus_platform.shell.DefaultProcessRunner;
import org.nimbus_platform.shell.Shell;

public class ChromeBrowserVersion implements BrowserVersion {

  private static final String CHROME_COMMAND = "powershell -command \"&{(Get-Item 'C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe').VersionInfo.ProductVersion}\"";

  @Override
  public String getBrowserVersion() {
    if (OSDetector.current().equals(OS.WINDOWS)) {
      Command command = Shell.command(CHROME_COMMAND);
      ProcessResult processResult =
          new DefaultProcessRunner().run(command);
      return processResult.stdOut();
    }
    throw new SystemException("OS support not available for "+OSDetector.current());
  }
}
