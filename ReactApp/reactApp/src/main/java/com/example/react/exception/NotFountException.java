package com.example.react.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class NotFountException extends RuntimeException
{
    private static final long serialVersionUID=1L;

    public NotFountException (String message)
    {
        super(message);
    }


}
