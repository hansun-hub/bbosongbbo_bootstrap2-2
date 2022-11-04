package com.example.bbosongbbo_bootstrap2.domain.posts;

import com.example.bbosongbbo_bootstrap2.web.dto.vuln_type_statsResponseDto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface vuln_type_statsRepository extends JpaRepository<vuln_type_stats, Long> {

    @Query("SELECT p FROM vuln_type_stats p ORDER BY p.stats_index DESC")
    List<vuln_type_stats> findAllDesc();

    @Query("SELECT p FROM vuln_type_stats p WHERE p.stats_date = ?1")
    List<vuln_type_stats> findByStats_Date(Date stats_date);

}
