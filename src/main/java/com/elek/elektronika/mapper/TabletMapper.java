package com.elek.elektronika.mapper;

import com.elek.elektronika.dao.entity.TabletsEntity;
import com.elek.elektronika.model.TabletDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class TabletMapper {

    public static final TabletMapper INSTANCE = Mappers.getMapper(TabletMapper.class);

    @Mappings({
        @Mapping(target = "name", source = "name"),
        @Mapping(target = "price", source = "price"),
        @Mapping(target = "picture", source = "picture"),
        @Mapping(target = "currency", source = "currency"),})
    public abstract TabletDto entityToDto(TabletsEntity tabletsEntity);

}
