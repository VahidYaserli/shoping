
package com.elek.elektronika.service;

import com.elek.elektronika.dao.entity.TeamEntity;
import com.elek.elektronika.dao.repository.TeamRepository;
import com.elek.elektronika.mapper.TeamMapper;
import com.elek.elektronika.model.TeamDto;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    
    @Autowired
    TeamRepository teamRepository;
    
    public List<TeamDto> getAllTeam() {
        List<TeamEntity> team = teamRepository.findAll();
        List<TeamDto> teamDtoList = team.stream().map(tm -> TeamMapper.INSTANCE.entityToDto(tm)).collect(Collectors.toList());

        return teamDtoList;
    }
    
}
