package com.example.bbosongbbo_bootstrap2.web;

import com.example.bbosongbbo_bootstrap2.web.dto.vuln_resultCount_listResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class VRClistApiController {

    private final com.example.bbosongbbo_bootstrap2.services.posts.vuln_resultCount_listService vuln_resultCount_listService;


    @GetMapping("/vuln_resultCount_list")
    public List<vuln_resultCount_listResponseDto> findAll() {
        return vuln_resultCount_listService.findAll();
    }

}
