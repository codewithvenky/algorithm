package com.venky.oracle.pkg36;

public class ExSuper extends Exception
{
    private final int eCode;
        public ExSuper(int eCode, Throwable cause)
        {
            super(cause);
            this.eCode = eCode;
        }

public ExSuper(int eCode, String msg, Throwable cause) {
    super(msg, cause);
    this.eCode = eCode;
}
public String getMessage() {
    return this.eCode + ": " + super.getMessage() + "-" + this.getCause().getMessage();
}

}