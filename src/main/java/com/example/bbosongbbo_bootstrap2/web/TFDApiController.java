package com.example.bbosongbbo_bootstrap2.web;

import com.example.bbosongbbo_bootstrap2.web.dto.trendFileandDirResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TFDApiController {

    private final com.example.bbosongbbo_bootstrap2.services.posts.trendFileandDirService trendFileandDirService;


    @GetMapping("/trendFileandDir")
    public List<trendFileandDirResponseDto> findAll() {
        return trendFileandDirService.findAll();
    }
}
