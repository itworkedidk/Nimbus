package org.nimbus_platform.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NimbusLoggerFactory {
  private NimbusLoggerFactory(){}

  public static NimbusLogging getLogger(Class<?> clazz){
    Logger logger = LogManager.getLogger(clazz);
    return new NimbusLogging(logger);
  }
}
