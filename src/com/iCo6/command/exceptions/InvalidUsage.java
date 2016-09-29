package com.iCo6.command.exceptions;

public class InvalidUsage extends Exception {
    public InvalidUsage(String message) {
        super("<rose>잘못된 명령어 사용: " + message);
    }
}
