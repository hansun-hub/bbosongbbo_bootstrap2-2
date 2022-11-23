package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.entity.trendService;
import lombok.Getter;

@Getter
public class trendServiceResponseDto {

    private int schedule_num;

    private int vuln_count;

    public trendServiceResponseDto(trendService entity) {
        this.schedule_num = entity.getSchedule_num();
        this.vuln_count = entity.getVuln_count();
    }
}
