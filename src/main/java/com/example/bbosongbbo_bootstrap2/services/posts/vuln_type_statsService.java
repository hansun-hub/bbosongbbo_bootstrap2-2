package com.example.bbosongbbo_bootstrap2.services.posts;

import com.example.bbosongbbo_bootstrap2.domain.posts.vuln_type_statsRepository;
import com.example.bbosongbbo_bootstrap2.web.dto.vuln_type_statsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class vuln_type_statsService {

    private final vuln_type_statsRepository vuln_type_statsRepository;

    @Transactional(readOnly = true)
    public List<vuln_type_statsResponseDto> findAllDesc() {
        return vuln_type_statsRepository.findAllDesc().stream()
                .map(vuln_type_statsResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public List<vuln_type_statsResponseDto> findByStats_Date(Date date) {
        return vuln_type_statsRepository.findByStats_Date(date).stream()
                .map(vuln_type_statsResponseDto::new)
                .collect(Collectors.toList());

//        vuln_type_stats entity = vuln_type_statsRepository.findByStats_Date(date);
//
//        return new vuln_type_statsResponseDto(entity);
    }

}
