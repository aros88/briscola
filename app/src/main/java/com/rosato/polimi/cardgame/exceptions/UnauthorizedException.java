package com.rosato.polimi.cardgame.exceptions;

public class UnauthorizedException extends Exception {
    public UnauthorizedException() {super();}

    public UnauthorizedException(String message) {
        super(message);
    }
}
