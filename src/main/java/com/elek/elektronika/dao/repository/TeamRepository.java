
package com.elek.elektronika.dao.repository;

import com.elek.elektronika.dao.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamRepository extends JpaRepository <TeamEntity, Integer> {
    
}
