package com.parabolt.lhet.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.parabolt.lhet.api.entity.HighRisk;

public interface HighRiskRepository extends JpaRepository<HighRisk, Integer> {

}
