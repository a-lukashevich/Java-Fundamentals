package com.calc;

public class InvalidStatementExeption extends Exception {
    public InvalidStatementExeption(String reason, String statement) {
        super(reason + ": " + statement);
    }

    public InvalidStatementExeption(String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);
    }


}
