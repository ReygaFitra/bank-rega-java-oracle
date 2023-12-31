package com.bankrega1.bankrega1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankrega1.bankrega1.model.Nasabah;

import jakarta.transaction.Transactional;

public interface NasabahRepository extends JpaRepository<Nasabah, String> {
    
    Nasabah findOneByNomorKtp(String nomorKtp);

    @Transactional
    void deleteByNomorKtp(String nomorKtp);
}
