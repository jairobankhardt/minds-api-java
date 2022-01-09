package com.dio.mindapi.service;

import com.dio.mindapi.dto.request.MindDTO;
import com.dio.mindapi.dto.response.MessageResponseDTO;
import com.dio.mindapi.entity.Mind;
import com.dio.mindapi.exception.MindNotFoudException;
import com.dio.mindapi.mapper.MindMapper;
import com.dio.mindapi.repository.MindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
        return createMessageResponse("Created mind with ID ", savedMind.getIdMind());
    }

    public List<MindDTO> listAll() {
        List<Mind> allMinds = mindRepository.findAll();
        return allMinds.stream()
                .map(mindMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MindDTO findById(Long id) throws MindNotFoudException {
        Mind mind = verifyIfExists(id);
        return mindMapper.toDTO(mind);
    }

    public void delete(Long id) throws MindNotFoudException {
        verifyIfExists(id);
        mindRepository.deleteById(id);
    }

    public MessageResponseDTO updateById(Long id, MindDTO mindDTO) throws MindNotFoudException {
        verifyIfExists(id);

        Mind mindToUpdate = mindMapper.toModel(mindDTO);
        Mind updatedMind = mindRepository.save(mindToUpdate);
        return createMessageResponse("Update mind with ID ", updatedMind.getIdMind());
    }

    private Mind verifyIfExists(Long id) throws MindNotFoudException {
        return mindRepository.findById(id)
                .orElseThrow(() -> new MindNotFoudException(id));
    }

    private MessageResponseDTO createMessageResponse(String message, Long id) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}
