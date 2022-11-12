package com.example.bbosongbbo_bootstrap2.repository;

import com.example.bbosongbbo_bootstrap2.entity.vuln_week_stats;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface vuln_week_statsRepository extends JpaRepository<vuln_week_stats, Integer> {

    @Override
    List<vuln_week_stats> findAll();

    @Query("SELECT p FROM vuln_week_stats p ORDER BY p.stats_week ASC")
    List<vuln_week_stats> findAllAsc();
}
