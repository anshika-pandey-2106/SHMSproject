package com.shms.hostelmanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

// @Document tells Spring Data-> save objects of this class into MongoDB collection 'students'
@Document(collection = "students")

// @Data is a Lombok annotation, generates
//   - getters for all fields (getName(), getRoomNumber(), …)
//   - setters for all fields (setName(…), setRoomNumber(…), …)
//   - toString(), equals(), hashCode()
@Data
public class Student {

    // @Id marks-> MongoDB's primary key (_id field).
    @Id
    private String id;

    // The student's full name
    private String name;

    // Permanent home address
    private String permanentAddress;

    // Contact number
    private String contactNumber;

    // URL/path to stored photo
    private String photoUrl;

    // Which hall is the student assigned to
    private String hallId;

    // Which room inside that hall
    private String roomId;

    // Date the student was registered
    private LocalDate admissionDate;

    // Whether student is currently residing (true) or has vacated (false)
    private boolean active = true;
}
