package com.parabolt.lhet.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.parabolt.lhet.api.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
