package com.shms.hostelmanagement.repository;

import com.shms.hostelmanagement.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

// MongoRepository<Student, String> means:
//   • We are managing 'Student' documents
//   • The type of the @Id field is String
// You now get free methods: save(), findById(), findAll(), deleteById(), count(), etc.
public interface StudentRepository extends MongoRepository<Student, String> {

    // Find all students in a specific hall.
    // Spring sees 'findBy' + 'HallId' and generates the MongoDB query automatically.
    List<Student> findByHallId(String hallId);

    // Find only active (currently residing) students.
    List<Student> findByActive(boolean active);

    // Check if a specific room is already assigned to any student.
    boolean existsByRoomId(String roomId);
}
