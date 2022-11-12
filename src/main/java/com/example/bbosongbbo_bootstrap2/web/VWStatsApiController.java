package com.example.bbosongbbo_bootstrap2.web;

import com.example.bbosongbbo_bootstrap2.web.dto.vuln_week_statsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class VWStatsApiController {

    private final com.example.bbosongbbo_bootstrap2.services.posts.vuln_week_statsService vuln_week_statsService;

    @GetMapping("/vuln_week_stats")
    public List<vuln_week_statsResponseDto> findAll() {return vuln_week_statsService.findAll();
    }

    @GetMapping("/vuln_week_stats/list")
    public List<vuln_week_statsResponseDto> findAllAsc() {return vuln_week_statsService.findAllAsc();
    }

}
