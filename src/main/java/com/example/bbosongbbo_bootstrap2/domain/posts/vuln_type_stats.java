package com.example.bbosongbbo_bootstrap2.domain.posts;

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
public class vuln_type_stats {

    @Id
    @GeneratedValue
    private Long stats_index;

    @Column
    private Long stats_count;

    @Column
    private Date stats_date;

    @Column
    private String stats_type;

}
