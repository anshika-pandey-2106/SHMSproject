package com.shms.hostelmanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "leave_records")
@Data
public class LeaveRecord {

    @Id
    private String id;

    // Which staff member took leave
    private String staffId;

    // Specific date of leave
    private LocalDate leaveDate;

    // Brief note if any ("sick leave", "personal", etc.)
    private String reason;
}
