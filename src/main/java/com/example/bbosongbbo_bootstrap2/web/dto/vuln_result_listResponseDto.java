package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.domain.posts.Posts;
import com.example.bbosongbbo_bootstrap2.entity.vuln_result_list;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
public class vuln_result_listResponseDto {

    private int id;

    private String vuln_number;

    private String vuln_name;

//    @Column(length = 100)
//    private String vuln_result_date;

    private String vuln_type;

    private String vuln_result;

    private String vuln_desc;

    private String vuln_severity;

    private String vuln_host_id;

    private int schedule_num;

    public vuln_result_listResponseDto(vuln_result_list entity) {
        this.id = entity.getId();
        this.vuln_name = entity.getVuln_name();
        this.vuln_number = entity.getVuln_number();
        this.vuln_result = entity.getVuln_result();
        this.vuln_type = entity.getVuln_type();
    }
}
