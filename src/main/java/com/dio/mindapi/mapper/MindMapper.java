package com.dio.mindapi.mapper;

import com.dio.mindapi.dto.request.MindDTO;
import com.dio.mindapi.entity.Mind;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MindMapper {

    MindMapper INSTANCE = Mappers.getMapper(MindMapper.class);

    @Mapping(source = "birthDate", target = "birthDate", dateFormat = "dd-MM-yyyy")
    @Mapping(source = "deathDate", target = "deathDate", dateFormat = "dd-MM-yyyy")
    Mind toModel(MindDTO mindDTO);

    MindDTO toDTO(Mind mind);
}
