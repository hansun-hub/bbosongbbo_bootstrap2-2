package com.example.bbosongbbo_bootstrap2.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder
public class vuln_result_list {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vuln_result_id")
    private int id;

    @Column(length = 10)
    private String vuln_number;

    @Column(length = 30)
    private String vuln_name;

//    @Column(length = 100)
//    private String vuln_result_date;

    @Column(length = 30)
    private String vuln_type;

    @Column(length = 30)
    private String vuln_result;

    @Column(length = 100)
    private String vuln_desc;

    @Column(length = 5)
    private String vuln_severity;

    @Column(length = 30)
    private String vuln_host_id;

    @Column(length = 50,nullable = false)
    private int schedule_num;

}
