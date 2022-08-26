package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.domain.posts.vuln_type_stats;
import lombok.Getter;

import java.sql.Date;

@Getter
public class vuln_type_statsResponseDto {

    private Long stats_index;

    private Long stats_count;

    private Date stats_date;

    private String stats_type;

    public vuln_type_statsResponseDto(vuln_type_stats entity) {
        this.stats_index = entity.getStats_index();
        this.stats_count = entity.getStats_count();
        this.stats_date = entity.getStats_date();
        this.stats_type = entity.getStats_type();
    }
}
