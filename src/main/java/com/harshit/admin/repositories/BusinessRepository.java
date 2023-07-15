package com.harshit.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshit.admin.entities.Business;

public interface BusinessRepository extends JpaRepository<Business, Integer> {

}
