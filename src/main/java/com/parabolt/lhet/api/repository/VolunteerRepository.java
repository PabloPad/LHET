package com.parabolt.lhet.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.parabolt.lhet.api.entity.Volunteer;

public interface VolunteerRepository extends JpaRepository<Volunteer, Integer> {

}
