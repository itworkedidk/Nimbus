package org.nimbus_platform;

import org.junit.Test;
import org.nimbus_platform.logging.NimbusLoggerFactory;
import org.nimbus_platform.logging.NimbusLogging;

public class TestNimbusLogging {
  private static final NimbusLogging logger =
      NimbusLoggerFactory.getLogger(TestNimbusLogging.class);
  @Test
  public void testNimbusLogging(){
    logger.info("Nimbus logging is live");
  }
}
