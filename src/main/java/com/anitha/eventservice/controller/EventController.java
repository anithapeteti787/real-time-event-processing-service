package com.anitha.eventservice.controller;

import com.anitha.eventservice.model.Event;
import com.anitha.eventservice.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService service;

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return service.saveEvent(event);
    }

    @GetMapping
    public List<Event> getEvents() {
        return service.getAllEvents();
    }
}