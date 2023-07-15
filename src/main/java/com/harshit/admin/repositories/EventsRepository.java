package com.harshit.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshit.admin.entities.Events;

public interface EventsRepository extends JpaRepository<Events, Integer> {

}
