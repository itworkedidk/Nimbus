package org.nimbus_exception.system_exception;

import org.nimbus_exception.exceptions.NimbusException;

public class SystemException extends NimbusException {
     public SystemException(String message){
       super(message);
     }

     public SystemException(String message, Throwable cause){
       super(message, cause);
     }
}
