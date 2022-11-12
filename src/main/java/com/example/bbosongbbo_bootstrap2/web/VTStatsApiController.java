package com.example.bbosongbbo_bootstrap2.web;

import com.example.bbosongbbo_bootstrap2.web.dto.vuln_type_statsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class VTStatsApiController {

    private final com.example.bbosongbbo_bootstrap2.services.posts.vuln_type_statsService vuln_type_statsService;

    @GetMapping("/vuln_type_stats")
    public List<vuln_type_statsResponseDto> findAll() {
        return vuln_type_statsService.findAllDesc();
    }

    @GetMapping("/vuln_type_stats/{date}")
    public List<vuln_type_statsResponseDto> findByStats_Date (@PathVariable Date date){
        return vuln_type_statsService.findByStats_Date(date);
    }
}
