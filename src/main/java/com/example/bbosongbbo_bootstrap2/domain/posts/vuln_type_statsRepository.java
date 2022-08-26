package com.example.bbosongbbo_bootstrap2.domain.posts;

import com.example.bbosongbbo_bootstrap2.web.dto.vuln_type_statsResponseDto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public interface vuln_type_statsRepository extends JpaRepository<vuln_type_stats, Long> {

}
