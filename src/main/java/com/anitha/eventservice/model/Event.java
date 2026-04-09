package com.anitha.eventservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventType;
    private String payload;
    private long timestamp;
}