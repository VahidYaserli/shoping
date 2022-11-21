package com.elek.elektronika.service;

import com.elek.elektronika.dao.entity.AccessoriesEntity;
import com.elek.elektronika.dao.entity.MobilEntity;
import com.elek.elektronika.dao.entity.TabletsEntity;
import com.elek.elektronika.dao.repository.AccessoriesRepository;
import com.elek.elektronika.dao.repository.MobilRepository;
import com.elek.elektronika.dao.repository.TabletsRepository;
import com.elek.elektronika.mapper.AccessoriesMapper;
//import com.elek.elektronika.mapper.CartMapper;
import java.util.List;
import java.util.stream.Collectors;
import com.elek.elektronika.mapper.MobilMapper;
import com.elek.elektronika.mapper.TabletMapper;
import com.elek.elektronika.model.AccessoriesDto;
import com.elek.elektronika.model.CartDto;
import com.elek.elektronika.model.MobilDto;
import com.elek.elektronika.model.TabletDto;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    MobilRepository mobilRepository;

    @Override
    public List<MobilDto> getAllMobil() {

        List<MobilEntity> mobil = mobilRepository.findAll();
        List<MobilDto> mobilDtoList = mobil.stream().map(it -> MobilMapper.INSTANCE.entityToDto(it)).collect(Collectors.toList());
        return mobilDtoList;

    }
    
    @Autowired
    TabletsRepository tabletsRepository;

    @Override
    public List<TabletDto> getAllTablet() {
        
    List<TabletsEntity> tablet = tabletsRepository.findAll();
    List<TabletDto> tabletDtoList;  
        tabletDtoList = tablet.stream().map(tb -> TabletMapper.INSTANCE.entityToDto(tb)).collect(Collectors.toList());
    return tabletDtoList;

    }

    @Autowired
    AccessoriesRepository accessoriesRepository;
    
    @Override
    public List<AccessoriesDto> getAllAccessories() {
        
        List<AccessoriesEntity> accessories = accessoriesRepository.findAll(); 
        List<AccessoriesDto> accessoriesDtoList;
        accessoriesDtoList = accessories.stream().map(ac -> AccessoriesMapper.INSTANCE.entityToDto(ac)).collect(Collectors.toList());
       
        return accessoriesDtoList;
    }

//    @Override
//    public List<CartDto> getAllProduct() {
//        
//        List<MobilEntity> mobil = mobilRepository.findAll();
//        List<MobilDto> mobilDtoList = mobil.stream().map(it -> MobilMapper.INSTANCE.entityToDto(it)).collect(Collectors.toList());
//        List<TabletsEntity> tablet = tabletsRepository.findAll();
//        List<TabletDto> tabletDtoList = tablet.stream().map(tb -> TabletMapper.INSTANCE.entityToDto(tb)).collect(Collectors.toList());
//        List<AccessoriesEntity> accessories = accessoriesRepository.findAll();
//        List<AccessoriesDto>  accessoriesDtoList = accessories.stream().map(ac -> AccessoriesMapper.INSTANCE.entityToDto(ac)).collect(Collectors.toList());
//        
//        List<CartDto> allProducts= new ArrayList<CartDto>() ;
//        allProducts.add((CartDto) mobilDtoList);
//        allProducts.add((CartDto) tabletDtoList);
//        allProducts.add((CartDto) accessoriesDtoList);
//        
//       return allProducts; 
//        
//        
//    
//    }

    @Override
    public TabletsEntity getTabletById(Integer id) { 
      
        
       return tabletsRepository.findById(id).get();
       
    }

    @Override
    public MobilEntity getMobilById(Integer id) {
      return mobilRepository.findById(id).get();
    }

    @Override
    public AccessoriesEntity getAccessoriesById(Integer id) {
       return accessoriesRepository.findById(id).get();
    }

}
