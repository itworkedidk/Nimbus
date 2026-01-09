package org.nimbus_exception.exceptions;

public class NimbusException extends RuntimeException{
   protected NimbusException(String message){
     super(message);
   }

   protected NimbusException(String message, Throwable cause){
     super(message,cause);
   }
}
