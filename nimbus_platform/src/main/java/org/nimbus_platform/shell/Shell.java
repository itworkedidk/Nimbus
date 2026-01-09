package org.nimbus_platform.shell;

import java.util.List;
import org.nimbus_platform.os.OS;
import org.nimbus_platform.os.OSDetector;
import org.nimbus_platform.process.Command;

public class Shell {
     public static Command command(String raw){
        return (OSDetector.current() == OS.WINDOWS)?
            new Command(List.of("cmd","/c",raw)):
            new Command(List.of("bash","-c",raw));
     }
}
