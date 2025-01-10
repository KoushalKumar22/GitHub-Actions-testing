package com.example.GitHub_Actions_Testing.Repository;

import com.example.GitHub_Actions_Testing.Entity.TestingActions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TARepository extends JpaRepository<TestingActions, Integer> {
}
