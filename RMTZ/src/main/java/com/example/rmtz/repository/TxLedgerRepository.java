package com.example.rmtz.repository;

import com.example.rmtz.entity.TxLedger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TxLedgerRepository extends JpaRepository<TxLedger, UUID> {
    Optional<TxLedger>findByUidAndRequestId(String uid,String RequestId);
}
