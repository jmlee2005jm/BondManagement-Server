package com.example.demo.repository;

import com.example.demo.domain.Bond;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BondRepository extends JpaRepository<Bond, Long> {

    List<Bond> findBondsByCreditorId(Long creditorId);
}
