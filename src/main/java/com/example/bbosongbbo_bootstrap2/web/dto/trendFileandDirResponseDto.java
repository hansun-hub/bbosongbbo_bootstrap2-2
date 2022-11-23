package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.entity.trendFileandDir;
import lombok.Getter;

@Getter
public class trendFileandDirResponseDto {

    private int schedule_num;

    private int vuln_count;

    public trendFileandDirResponseDto(trendFileandDir entity) {
        this.schedule_num = entity.getSchedule_num();
        this.vuln_count = entity.getVuln_count();
    }
}
