package org.nimbus_platform.os;

import org.nimbus_exception.system_exception.SystemException;

public class OSDetector {
    public static OS current(){
      String os = System.getProperty("os.name").toLowerCase();
      if(os.contains("win")) return OS.WINDOWS;
      if(os.contains("mac")) return OS.MAC;
      if(os.contains("lix") || os.contains("lux")) return OS.LINUX;
      throw new SystemException("Unsupported OS: "+os);
    }
}
