package com.elek.elektronika.controller;

import com.elek.elektronika.dao.entity.MessageEntity;
import com.elek.elektronika.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class MessageController {
    
    @Autowired
    MessageService messageService;

    @PostMapping()
    public ResponseEntity<MessageEntity> addMessage(@RequestBody MessageEntity message) {
        return new ResponseEntity<MessageEntity>(messageService.saveMassage(message), HttpStatus.CREATED);
    }

}
