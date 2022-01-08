package com.dio.mindapi.repository;

import com.dio.mindapi.entity.Mind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MindRepository extends JpaRepository<Mind, Long> {
}
