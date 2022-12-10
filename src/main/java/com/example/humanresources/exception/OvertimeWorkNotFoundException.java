package com.example.humanresources.exception;

import com.example.humanresources.entity.OvertimeWork;

public class OvertimeWorkNotFoundException extends RuntimeException{
    public OvertimeWorkNotFoundException(String message) {
        super(message);
    }
}
