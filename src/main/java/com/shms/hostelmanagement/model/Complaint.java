package com.shms.hostelmanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "complaints")
@Data
public class Complaint {

    @Id
    private String id;

    // Who raised the complaint
    private String studentId;

    // Hall where the problem is
    private String hallId;

    // Category helps wardens prioritise:
    // "MAINTENANCE" / "STAFF_BEHAVIOUR" / "MESS" / "OTHER"
    private String category;

    // Detailed description written by the student
    private String description;

    // Lifecycle: "OPEN" → "IN_PROGRESS" → "RESOLVED"
    private String status = "OPEN";

    // When the complaint was submitted
    private LocalDateTime raisedAt;

    // Warden writes what action was taken to fix the issue
    private String actionTakenReport;

    // When the warden posted the ATR
    private LocalDateTime resolvedAt;
}