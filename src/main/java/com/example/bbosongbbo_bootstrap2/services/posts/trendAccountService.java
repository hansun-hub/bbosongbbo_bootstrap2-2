package com.example.bbosongbbo_bootstrap2.services.posts;

import com.example.bbosongbbo_bootstrap2.repository.trendAccountRepository;
import com.example.bbosongbbo_bootstrap2.web.dto.trendAccountResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class trendAccountService {
    private final trendAccountRepository tARepository;

    @Transactional(readOnly = true)
    public List<trendAccountResponseDto> findAll() {
        return tARepository.findAll().stream()
                .map(trendAccountResponseDto::new)
                .collect(Collectors.toList());
    }
}
