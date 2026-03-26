package com.shms.hostelmanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "payments")
@Data
public class Payment {

    @Id
    private String id;

    // Which student made this payment
    private String studentId;

    // Breakdown of charges for this billing month
    private double messCharge;
    private double amenityCharge;
    private double roomRent;

    // Total = messCharge + amenityCharge + roomRent
    // Computed in the Service layer before saving
    private double totalAmount;

    // How the student paid: "CASH" or "CHEQUE"
    private String paymentMode;

    // How much has actually been paid so far (allows partial payments)
    private double amountPaid;

    // Remaining balance (totalAmount - amountPaid)
    private double balanceDue;

    // Exact time the payment was recorded
    private LocalDateTime paymentDate;

    // Billing period, e.g. "2024-03" means March 2024
    private String billingMonth;   // format: "YYYY-MM"
}
