package com.example.bbosongbbo_bootstrap2.web;

import com.example.bbosongbbo_bootstrap2.web.dto.trendServiceResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TSApiController {

    private final com.example.bbosongbbo_bootstrap2.services.posts.trendServiceService trendServiceService;


    @GetMapping("/trendService")
    public List<trendServiceResponseDto> findAll() {
        return trendServiceService.findAll();
    }
}
