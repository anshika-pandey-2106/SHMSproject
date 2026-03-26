package com.shms.hostelmanagement.repository;

import com.shms.hostelmanagement.model.Complaint;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ComplaintRepository extends MongoRepository<Complaint, String> {

    // Student views their own complaints
    List<Complaint> findByStudentId(String studentId);

    // Warden views all complaints for their hall
    List<Complaint> findByHallId(String hallId);

    // Warden filters: show only OPEN complaints
    List<Complaint> findByHallIdAndStatus(String hallId, String status);
}
