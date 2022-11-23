package com.example.bbosongbbo_bootstrap2.services.posts;

import com.example.bbosongbbo_bootstrap2.repository.trendFileandDirRepository;
import com.example.bbosongbbo_bootstrap2.web.dto.trendFileandDirResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class trendFileandDirService {

    private final trendFileandDirRepository tFDRepository;

    @Transactional(readOnly = true)
    public List<trendFileandDirResponseDto> findAll() {
        return tFDRepository.findAll().stream()
                .map(trendFileandDirResponseDto::new)
                .collect(Collectors.toList());
    }
}
