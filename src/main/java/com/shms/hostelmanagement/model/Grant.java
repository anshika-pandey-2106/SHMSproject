package com.shms.hostelmanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "grants")
@Data
public class Grant {

    @Id
    private String id;

    // Which hall received this grant
    private String hallId;

    // Total amount allocated to this hall
    private double allocatedAmount;

    // How much has been spent so far (updated as warden logs expenses)
    private double spentAmount = 0;

    // Year this grant covers (e.g. 2024)
    private int year;

    // Date the chairman distributed the grant
    private LocalDate distributedOn;
}
