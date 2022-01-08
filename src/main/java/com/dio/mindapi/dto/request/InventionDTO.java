package com.dio.mindapi.dto.request;

import com.dio.mindapi.enums.InventionApply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventionDTO {

    private Long idInvention;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String nameInvention;

    @Enumerated(EnumType.STRING)
    private InventionApply apply;

}
