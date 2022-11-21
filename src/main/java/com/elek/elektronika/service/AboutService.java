package com.elek.elektronika.service;

import com.elek.elektronika.dao.entity.AboutEntity;
import com.elek.elektronika.dao.repository.AboutRepository;
import com.elek.elektronika.mapper.AboutMapper;
import com.elek.elektronika.model.AboutDto;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    @Autowired
    AboutRepository aboutRepository;

    public List<AboutDto> getAllAbout() {
        List<AboutEntity> about = aboutRepository.findAll();
        List<AboutDto> aboutDtoList = about.stream().map(ab -> AboutMapper.INSTANCE.entityToDto(ab)).collect(Collectors.toList());

        return aboutDtoList;
    }

}
