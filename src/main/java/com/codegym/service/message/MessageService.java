package com.codegym.service.message;

import com.codegym.model.Message;
import com.codegym.repository.IMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MessageService implements IMessageService {
    @Autowired
    private IMessageRepository messageRepository;

    @Override
    public Iterable<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public Optional<Message> findById(Long id) {
        return messageRepository.findById(id);
    }

    @Override
    public void save(Message customer) {
        messageRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        messageRepository.deleteById(id);
    }
}
