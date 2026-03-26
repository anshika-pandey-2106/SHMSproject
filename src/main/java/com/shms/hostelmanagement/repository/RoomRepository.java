package com.shms.hostelmanagement.repository;

import com.shms.hostelmanagement.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface RoomRepository extends MongoRepository<Room, String> {

    // Get all rooms in a specific hall
    List<Room> findByHallId(String hallId);

    // Get only vacant rooms in a hall (occupied = false)
    List<Room> findByHallIdAndOccupied(String hallId, boolean occupied);

    // Count how many rooms are occupied in a hall
    long countByHallIdAndOccupied(String hallId, boolean occupied);
}
