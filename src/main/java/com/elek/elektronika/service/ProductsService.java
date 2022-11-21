package com.elek.elektronika.service;

import com.elek.elektronika.dao.entity.AccessoriesEntity;
import com.elek.elektronika.dao.entity.MobilEntity;
import com.elek.elektronika.dao.entity.TabletsEntity;
import com.elek.elektronika.model.AccessoriesDto;
import com.elek.elektronika.model.CartDto;
import java.util.List;
import com.elek.elektronika.model.MobilDto;
import com.elek.elektronika.model.TabletDto;
import org.springframework.stereotype.Service;


@Service
public interface ProductsService {

    List<TabletDto> getAllTablet();

    List<AccessoriesDto> getAllAccessories();

    List<MobilDto> getAllMobil();

//    List<CartDto> getAllProduct();
    
    TabletsEntity getTabletById(Integer id);
    
    MobilEntity getMobilById(Integer id);
    
    AccessoriesEntity getAccessoriesById(Integer id);
    
}
