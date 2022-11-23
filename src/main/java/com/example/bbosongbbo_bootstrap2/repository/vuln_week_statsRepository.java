package com.example.bbosongbbo_bootstrap2.repository;

import com.example.bbosongbbo_bootstrap2.domain.posts.vuln_type_stats;
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

    @Query("SELECT p FROM vuln_week_stats p WHERE p.stats_type = '계정관리' ORDER BY p.stats_week ASC")
    List<vuln_week_stats> findByAC();

    @Query("SELECT p FROM vuln_week_stats p WHERE p.stats_type = '파일 및 디렉토리 관리' ORDER BY p.stats_week ASC")
    List<vuln_week_stats> findByFD();

    @Query("SELECT p FROM vuln_week_stats p WHERE p.stats_type = '서비스 관리' ORDER BY p.stats_week ASC")
    List<vuln_week_stats> findBySE();
}
