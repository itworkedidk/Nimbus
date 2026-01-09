package org.nimbus_platform.shell;

import org.nimbus_exception.system_exception.SystemException;
import org.nimbus_platform.process.Command;
import org.nimbus_platform.process.ProcessResult;
import org.nimbus_platform.process.ProcessRunner;

public class DefaultProcessRunner implements ProcessRunner {

  @Override
  public ProcessResult run(Command command) {
    try{
        ProcessBuilder builder = new ProcessBuilder(command.args());
        Process process = builder.start();
        String stdout =
            new String(process.getInputStream().readAllBytes());
        String stderr =
            new String(process.getErrorStream().readAllBytes());
        int exitCode = process.waitFor();
        return new ProcessResult(exitCode,stdout,stderr);
    }catch (Exception e){
      throw new SystemException("Failed to run command "+command.args(),e);
    }
  }
}
