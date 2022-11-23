package com.example.bbosongbbo_bootstrap2.web;

import com.example.bbosongbbo_bootstrap2.web.dto.vuln_type_statsResponseDto;
import com.example.bbosongbbo_bootstrap2.web.dto.vuln_week_statsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
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

    @GetMapping("/vuln_week_stats/AC")
    public List<vuln_week_statsResponseDto> findByAC (){
        return vuln_week_statsService.findByAC();
    }

    @GetMapping("/vuln_week_stats/FD")
    public List<vuln_week_statsResponseDto> findByFD (){
        return vuln_week_statsService.findByFD();
    }

    @GetMapping("/vuln_week_stats/SE")
    public List<vuln_week_statsResponseDto> findBySE (){
        return vuln_week_statsService.findBySE();
    }

}
