package com.shms.hostelmanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rooms")
@Data
public class Room {

    @Id
    private String id;

    // Which hall this room belongs to
    private String hallId;

    // Room identifier like "A-204"
    private String roomNumber;

    // "SINGLE" or "TWIN" — twin-sharing rooms have lower rent
    private String occupancyType;   // SINGLE / TWIN

    // Monthly rent for this room in rupees
    private double rent;

    // true = someone is living here, false = vacant
    private boolean occupied = false;

    // If occupied, store the student's id here for quick lookup
    private String occupiedByStudentId;
}