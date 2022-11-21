package com.elek.elektronika.mapper;

import com.elek.elektronika.dao.entity.MobilEntity;
import com.elek.elektronika.model.MobilDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class MobilMapper {

    public static final MobilMapper INSTANCE = Mappers.getMapper(MobilMapper.class);

    @Mappings({
        @Mapping(target = "id", source = "id"),
        @Mapping(target = "name", source = "name"),
        @Mapping(target = "price", source = "price"),
        @Mapping(target = "picture", source = "picture"),
        @Mapping(target = "currency", source = "currency"),})
    public abstract MobilDto entityToDto(MobilEntity mobilEntity);

}
