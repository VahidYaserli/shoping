package com.elek.elektronika.mapper;

import com.elek.elektronika.dao.entity.AccessoriesEntity;
import com.elek.elektronika.model.AccessoriesDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AccessoriesMapper {

    public static final AccessoriesMapper INSTANCE = Mappers.getMapper(AccessoriesMapper.class);

    @Mappings({
        @Mapping(target = "name", source = "name"),
        @Mapping(target = "price", source = "price"),
        @Mapping(target = "picture", source = "picture"),
        @Mapping(target = "currency", source = "currency"),})
    public abstract AccessoriesDto entityToDto(AccessoriesEntity accessoriesEntity);

}
