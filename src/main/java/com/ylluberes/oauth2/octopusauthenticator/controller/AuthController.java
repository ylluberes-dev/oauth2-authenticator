package com.ylluberes.oauth2.octopusauthenticator.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class AuthController {

    @GetMapping
    public Principal getUser (final Principal user) {
        return user;
    }
}
