
package com.elek.elektronika.dao.repository;


import com.elek.elektronika.dao.entity.AccessoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccessoriesRepository extends JpaRepository <AccessoriesEntity, Integer> {
    
}
