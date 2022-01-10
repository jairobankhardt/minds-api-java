package com.dio.mindapi.controller;

import com.dio.mindapi.dto.request.MindDTO;
import com.dio.mindapi.dto.response.MessageResponseDTO;
import com.dio.mindapi.exception.MindNotFoudException;
import com.dio.mindapi.service.MindService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/minds")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MindController {

    private MindService mindService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createMind(@RequestBody @Valid MindDTO mindDTO) {
        return mindService.createMind(mindDTO);
    }

    @GetMapping
    public List<MindDTO> listAll() {
        return mindService.listAll();
    }

    @GetMapping("/{id}")
    public MindDTO findById(@PathVariable Long id) throws MindNotFoudException {
        return mindService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid MindDTO mindDTO) throws MindNotFoudException {
        return mindService.updateById(id, mindDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByID(@PathVariable Long id) throws MindNotFoudException {
        mindService.delete(id);
    }
}
