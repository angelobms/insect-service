package com.bmstech.insectservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/insects")
public class InsectController {

    @GetMapping
    public ResponseEntity<String> get(){
        return new ResponseEntity<>("OK", OK);
    }
}
