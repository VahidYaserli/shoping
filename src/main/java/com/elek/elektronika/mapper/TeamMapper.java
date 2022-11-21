package com.elek.elektronika.mapper;

import com.elek.elektronika.dao.entity.TeamEntity;
import com.elek.elektronika.model.TeamDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class TeamMapper {

    public static final TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    @Mappings({
        @Mapping(target = "picture", source = "picture"),
        @Mapping(target = "name", source = "name"),
        @Mapping(target = "description", source = "description"),})
    public abstract TeamDto entityToDto(TeamEntity teamEntity);

}
