package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.entity.vuln_resultCount_list;
import lombok.Getter;

@Getter
public class vuln_resultCount_listResponseDto {

    private String result;

    private int count;

    public vuln_resultCount_listResponseDto(vuln_resultCount_list entity) {
        this.result = entity.getResult();
        this.count = entity.getCount();
    }
}
