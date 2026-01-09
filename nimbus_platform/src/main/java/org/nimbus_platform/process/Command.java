package org.nimbus_platform.process;

import java.util.List;

public class Command {
  private List<String> args;

  public Command(List<String> args) {
    this.args = args;
  }

  public List<String> args() {
    return args;
  }
}
