package com.example.bbosongbbo_bootstrap2.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Getter
@ToString
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder
public class vuln_week_stats {

    @Id
    @GeneratedValue
    private int stats_index;

    @Column
    private int stats_count;

    @Column
    private int stats_week;

    @Column(length = 30)
    private String stats_type;

}
