package com.example.bbosongbbo_bootstrap2.services.posts;

import com.example.bbosongbbo_bootstrap2.domain.posts.vuln_type_statsRepository;
import com.example.bbosongbbo_bootstrap2.web.dto.vuln_type_statsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
