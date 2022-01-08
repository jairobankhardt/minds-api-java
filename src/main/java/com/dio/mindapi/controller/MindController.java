package com.dio.mindapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/minds")
public class MindController {

    @GetMapping
    public String getMind() {
        return "There are many brilliant minds in the world.";
    }
}
