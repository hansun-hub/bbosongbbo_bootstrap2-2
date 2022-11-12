package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.entity.vuln_week_stats;
import lombok.Getter;

@Getter
public class vuln_week_statsResponseDto {

    private int stats_index;

    private int stats_count;

    private int stats_week;

    private String stats_type;

    public vuln_week_statsResponseDto(vuln_week_stats entity) {
        this.stats_index = entity.getStats_index();
        this.stats_count = entity.getStats_count();
        this.stats_week = entity.getStats_week();
        this.stats_type = entity.getStats_type();
    }
}
