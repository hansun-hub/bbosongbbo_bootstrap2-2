package com.example.bbosongbbo_bootstrap2.services.posts;

import com.example.bbosongbbo_bootstrap2.repository.trendServiceRepository;
import com.example.bbosongbbo_bootstrap2.web.dto.trendServiceResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class trendServiceService {

    private final trendServiceRepository tSRepository;

    @Transactional(readOnly = true)
    public List<trendServiceResponseDto> findAll() {
        return tSRepository.findAll().stream()
                .map(trendServiceResponseDto::new)
                .collect(Collectors.toList());
    }
}
