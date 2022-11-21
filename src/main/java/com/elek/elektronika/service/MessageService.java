package com.elek.elektronika.service;

import com.elek.elektronika.dao.entity.MessageEntity;
import com.elek.elektronika.dao.repository.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    
    @Autowired
    MessageRepository repo;
    
    public MessageEntity saveMassage(MessageEntity message){
    
    return repo.save(message);
   
    }
    
}
