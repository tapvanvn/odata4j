package org.odata4j.producer.exceptions;

import javax.ws.rs.core.Response.Status.Family;
import javax.ws.rs.core.Response.StatusType;

public class MethodNotAllowedException extends ODataException {

  private static final long serialVersionUID = 1L;

  // available in JAX-RS Version 2.0
  public static final StatusType METHOD_NOT_ALLOWED = new StatusType() {

    public int getStatusCode() {
      return 405;
    }

    public Family getFamily() {
      return Family.CLIENT_ERROR;
    }

    public String getReasonPhrase() {
      return "Method Not Allowed";
    }
  };

  public MethodNotAllowedException() {
    super(METHOD_NOT_ALLOWED);
  }

  public MethodNotAllowedException(String message) {
    super(METHOD_NOT_ALLOWED, message);
  }

  public MethodNotAllowedException(String message, Throwable cause) {
    super(METHOD_NOT_ALLOWED, message, cause);
  }
}
