package com.dio.mindapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MindDTO {

    private Long idMind;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String nameMind;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String country;

    @NotEmpty
    private String birthDate;

    private String deathDate;

    @Valid
    @NotEmpty
    private List<InventionDTO> inventions;
}
