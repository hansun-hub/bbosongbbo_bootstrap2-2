package com.example.bbosongbbo_bootstrap2.services.posts;

import com.example.bbosongbbo_bootstrap2.web.dto.vuln_type_statsResponseDto;
import com.example.bbosongbbo_bootstrap2.web.dto.vuln_week_statsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class vuln_week_statsService {

    private final com.example.bbosongbbo_bootstrap2.repository.vuln_week_statsRepository vuln_week_statsRepository;

    @Transactional(readOnly = true)
    public List<vuln_week_statsResponseDto> findAll() {
        return vuln_week_statsRepository.findAll().stream()
                .map(vuln_week_statsResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<vuln_week_statsResponseDto> findAllAsc() {
        return vuln_week_statsRepository.findAllAsc().stream()
                .map(vuln_week_statsResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public List<vuln_week_statsResponseDto> findByAC() {
        return vuln_week_statsRepository.findByAC().stream()
                .map(vuln_week_statsResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public List<vuln_week_statsResponseDto> findByFD() {
        return vuln_week_statsRepository.findByFD().stream()
                .map(vuln_week_statsResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public List<vuln_week_statsResponseDto> findBySE() {
        return vuln_week_statsRepository.findBySE().stream()
                .map(vuln_week_statsResponseDto::new)
                .collect(Collectors.toList());
    }


}
