package com.anitha.eventservice.service;

import com.anitha.eventservice.model.Event;
import com.anitha.eventservice.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public Event saveEvent(Event event) {
        event.setTimestamp(System.currentTimeMillis());
        return repository.save(event);
    }

    public List<Event> getAllEvents() {
        return repository.findAll();
    }
}