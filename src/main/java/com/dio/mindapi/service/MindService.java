package com.dio.mindapi.service;

import com.dio.mindapi.dto.response.MessageResponseDTO;
import com.dio.mindapi.entity.Mind;
import com.dio.mindapi.repository.MindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MindService {

    private MindRepository mindRepository;

    @Autowired
    public MindService(MindRepository mindRepository) {
        this.mindRepository = mindRepository;
    }

    public MessageResponseDTO createMind(Mind mind) {
        Mind savedMind = mindRepository.save(mind);
        return MessageResponseDTO
                .builder()
                .message("Created mind with ID " + savedMind.getIdMind())
                .build();
    }
}
