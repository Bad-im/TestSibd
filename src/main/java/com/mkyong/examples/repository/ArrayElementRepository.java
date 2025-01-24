package com.mkyong.examples.repository;

import com.mkyong.examples.model.ArrayElement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArrayElementRepository extends JpaRepository<ArrayElement, Long> {
    List<ArrayElement> findBySortId(Long sortId);
}
