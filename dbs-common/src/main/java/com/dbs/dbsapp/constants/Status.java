package com.dbs.dbsapp.constants;

/**
 * @author EPAM
 */
public enum Status {
     /**
      * Enum for active or inactive status information.
      */
     INACTIVE(0),
     ACTIVE(1);

     /**
      * User status.
      */
     private final int status;

     /**
      * Constructor function for status.
      *
      * @param status of type {@link Integer}.
      */
     Status(final int status) {
          this.status = status;
     }

     /**
      * Getter for get status code.
      *
      * @return status.
      */
     public int getStatusCode() {
          return this.status;
     }

}
