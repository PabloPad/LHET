package com.parabolt.lhet.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.parabolt.lhet.api.entity.VisitLog;

public interface VisitLogRepository extends JpaRepository<VisitLog, Integer> {

}
