
package com.elek.elektronika.dao.repository;

import com.elek.elektronika.dao.entity.MobilEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MobilRepository extends JpaRepository <MobilEntity, Integer> {
    
}
