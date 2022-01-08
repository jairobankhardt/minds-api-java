package com.dio.mindapi.service;

import com.dio.mindapi.dto.request.MindDTO;
import com.dio.mindapi.dto.response.MessageResponseDTO;
import com.dio.mindapi.entity.Mind;
import com.dio.mindapi.mapper.MindMapper;
import com.dio.mindapi.repository.MindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MindService {

    private MindRepository mindRepository;

    private final MindMapper mindMapper = MindMapper.INSTANCE;

    @Autowired
    public MindService(MindRepository mindRepository) {
        this.mindRepository = mindRepository;
    }

    public MessageResponseDTO createMind(MindDTO mindDTO) {
        Mind mindToSave = mindMapper.toModel(mindDTO);
        Mind savedMind = mindRepository.save(mindToSave);
        return MessageResponseDTO
                .builder()
                .message("Created mind with ID " + savedMind.getIdMind())
                .build();
    }

    public List<MindDTO> listAll() {
        List<Mind> allMinds = mindRepository.findAll();
        return allMinds.stream()
                .map(mindMapper::toDTO)
                .collect(Collectors.toList());
    }
}
