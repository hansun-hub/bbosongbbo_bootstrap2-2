package com.example.bbosongbbo_bootstrap2.services.posts;

import com.example.bbosongbbo_bootstrap2.repository.vuln_resultCount_listRepository;
import com.example.bbosongbbo_bootstrap2.web.dto.vuln_resultCount_listResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class vuln_resultCount_listService {

    private final vuln_resultCount_listRepository vtrCRepository;

    @Transactional(readOnly = true)
    public List<vuln_resultCount_listResponseDto> findAll() {
        return vtrCRepository.findAll().stream()
                .map(vuln_resultCount_listResponseDto::new)
                .collect(Collectors.toList());
    }
}
