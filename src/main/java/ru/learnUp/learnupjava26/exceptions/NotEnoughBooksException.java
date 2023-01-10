package ru.learnUp.learnupjava26.exceptions;

public class NotEnoughBooksException extends RuntimeException{

    public NotEnoughBooksException(String str) {
        super(str);
    }
}