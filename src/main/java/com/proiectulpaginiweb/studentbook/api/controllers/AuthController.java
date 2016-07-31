package com.proiectulpaginiweb.studentbook.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public ResponseEntity<String> auth(@RequestParam(value="name") String user) {
        if(user.equals("my value")) {
            return new ResponseEntity<String>("da", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("nu", HttpStatus.BAD_REQUEST);
        }
    }
}
