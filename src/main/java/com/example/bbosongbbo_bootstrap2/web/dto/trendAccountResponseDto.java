package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.entity.trendAccount;
import lombok.Getter;

@Getter
public class trendAccountResponseDto {

    private int schedule_num;

    private int vuln_count;

    public trendAccountResponseDto(trendAccount entity) {
        this.schedule_num = entity.getSchedule_num();
        this.vuln_count = entity.getVuln_count();
    }
}
