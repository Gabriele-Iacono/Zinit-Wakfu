package com.iacono.app.Zinit.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildController {

        @PostMapping("/build")
        @PreAuthorize("hasRole('USER')")
        public ResponseEntity<?> createBuild(@RequestBody BuildRequest buildRequest) {
            // per creare una build con pg, passive e oggetti
            return ResponseEntity.ok("Build creata");
        }
    }
