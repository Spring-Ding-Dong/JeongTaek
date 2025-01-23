package com.springdingdong.jeongtaek.assignment2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    Developer findByNameAndPart(String name, String part);
}
