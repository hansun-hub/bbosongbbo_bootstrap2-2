package com.example.bbosongbbo_bootstrap2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HostList {

    @Id
    private String hostId;

    private String hostIp;

    private String hostDesc;
}
