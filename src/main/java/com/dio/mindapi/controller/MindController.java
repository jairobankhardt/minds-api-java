package com.dio.mindapi.controller;

import com.dio.mindapi.dto.response.MessageResponseDTO;
import com.dio.mindapi.entity.Mind;
import com.dio.mindapi.service.MindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/minds")
public class MindController {

    private MindService mindService;

    @Autowired
    public MindController(MindService mindService) {
        this.mindService = mindService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createMind(@RequestBody Mind mind) {
        return mindService.createMind(mind);
    }
}
