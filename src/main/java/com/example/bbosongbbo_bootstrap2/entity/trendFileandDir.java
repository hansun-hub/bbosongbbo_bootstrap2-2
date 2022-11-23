package com.example.bbosongbbo_bootstrap2.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@ToString
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder
public class trendFileandDir {

    @Id
    @GeneratedValue
    @Column(length = 50)
    private int schedule_num;

    @Column(length = 20)
    private int vuln_count;
}
