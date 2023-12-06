package com.neoalerts.neodiscoveryservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class NeoWSController {

    @GetMapping(path = "/ping")
    public ResponseEntity<String> getPing() {
        return ResponseEntity.ok("I am up!");
    }

}
