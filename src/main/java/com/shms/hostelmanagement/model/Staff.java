package com.shms.hostelmanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "staff")
@Data
public class Staff {

    @Id
    private String id;

    private String name;

    // "ATTENDANT" or "GARDENER"
    private String role;

    // Which hall they work in
    private String hallId;

    // Pay per working day in rupees
    private double dailyPay;

    // false when staff member leaves (soft-delete: keeps records for audit)
    private boolean active = true;
}
