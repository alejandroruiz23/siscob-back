package com.siscob.security.repository;

import com.siscob.security.entity.CentroCosto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentroCostoRepo extends JpaRepository<CentroCosto, String> {
}
