package org.nimbus_platform.process;

public class ProcessResult {
  private int exitCode;
  private String stdOut;
  private String stderr;

  public ProcessResult(int exitCode, String stdOut, String stderr) {
    this.exitCode = exitCode;
    this.stdOut = stdOut;
    this.stderr = stderr;
  }

  public int exitCode() {
    return exitCode;
  }

  public String stdOut() {
    return stdOut;
  }

  public String stderr() {
    return stderr;
  }
}
