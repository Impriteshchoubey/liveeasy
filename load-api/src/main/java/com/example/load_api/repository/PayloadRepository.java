package com.example.load_api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.load_api.model.Payload;
@Repository

public interface PayloadRepository extends JpaRepository<Payload, Long> {

}