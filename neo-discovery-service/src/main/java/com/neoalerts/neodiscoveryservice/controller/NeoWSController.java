package com.neoalerts.neodiscoveryservice.controller;

import com.neoalerts.neodiscoveryservice.service.NasaAPIService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class NeoWSController {

    private final NasaAPIService nasaAPIService;

    public NeoWSController(NasaAPIService nasaAPIService) {
        this.nasaAPIService = nasaAPIService;
    }

    @GetMapping(path = "/ping")
    public ResponseEntity<String> getPing() {
        nasaAPIService.makeNeoWsRequest();
        return ResponseEntity.ok("I am up!");
    }

}
