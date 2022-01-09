package com.dio.mindapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MindNotFoudException extends Exception {
    public MindNotFoudException(Long id) {
        super("Mind not found with ID " + id);
    }
}
