package com.example.bbosongbbo_bootstrap2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class vuln_resultCount_list {

    @Id
    @Column(length = 100, nullable = false)
    private String result;

    private int count;

}
