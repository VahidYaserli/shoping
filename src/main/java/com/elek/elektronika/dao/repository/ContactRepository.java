package com.elek.elektronika.dao.repository;




import com.elek.elektronika.dao.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {
    
    
}
