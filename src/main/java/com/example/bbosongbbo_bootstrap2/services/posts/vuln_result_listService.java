package com.example.bbosongbbo_bootstrap2.services.posts;

import com.example.bbosongbbo_bootstrap2.repository.vuln_result_listRepository;
import com.example.bbosongbbo_bootstrap2.web.dto.vuln_result_listResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class vuln_result_listService {

    private final vuln_result_listRepository vrlRepository;

    @Transactional(readOnly = true)
    public List<vuln_result_listResponseDto> findAllDesc() {
        return vrlRepository.findAllDesc().stream()
                .map(vuln_result_listResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<vuln_result_listResponseDto> findFirst31ByOrderByIdDesc() {
        return vrlRepository.findFirst31ByOrderByIdDesc().stream()
                .map(vuln_result_listResponseDto::new)
                .collect(Collectors.toList());
    }
}
