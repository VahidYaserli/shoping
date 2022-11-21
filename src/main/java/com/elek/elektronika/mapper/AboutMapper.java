package com.elek.elektronika.mapper;

import com.elek.elektronika.dao.entity.AboutEntity;
import com.elek.elektronika.model.AboutDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AboutMapper {

    public static final AboutMapper INSTANCE = Mappers.getMapper(AboutMapper.class);

    @Mappings({
        @Mapping(target = "picture", source = "picture"),
        @Mapping(target = "text", source = "text"),})
    public abstract AboutDto entityToDto(AboutEntity aboutEntity);

}
