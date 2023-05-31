package com.example.jobhub.ControllerAdvise;

import com.example.jobhub.ApiExeption.ApiExeption;
import com.example.jobhub.ApiResponce.ApiRecponse;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvise {
    @ExceptionHandler(value = ApiExeption.class)
    public ResponseEntity<ApiRecponse> ApiExeption(ApiExeption e){
        String message= e.getMessage();
        return ResponseEntity.status(400).body(new ApiRecponse(message));
    }
    //
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ApiRecponse>DataIntegrityViolationException(DataIntegrityViolationException e) {
        String message = e.getMessage();
        return ResponseEntity.status(400).body(new ApiRecponse(message));
    }

}
