package com.example.bbosongbbo_bootstrap2.web;

import com.example.bbosongbbo_bootstrap2.web.dto.trendAccountResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TAApiController {

    private final com.example.bbosongbbo_bootstrap2.services.posts.trendAccountService trendAccountService;


    @GetMapping("/trendAccount")
    public List<trendAccountResponseDto> findAll() {
        return trendAccountService.findAll();
    }
}
