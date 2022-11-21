package com.elek.elektronika.dao.repository;




import com.elek.elektronika.dao.entity.TabletsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TabletsRepository extends JpaRepository <TabletsEntity, Integer> {
    
}
