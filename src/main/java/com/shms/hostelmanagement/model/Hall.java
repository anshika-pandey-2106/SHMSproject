package com.shms.hostelmanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "halls")
@Data
public class Hall {

    @Id
    private String id;

    // Hall name
    private String name;

    // Monthly amenity charge levied on every student in this hall
    private double amenityCharge;

    // The grant money currently available for this hall to spend
    private double grantBalance;
}