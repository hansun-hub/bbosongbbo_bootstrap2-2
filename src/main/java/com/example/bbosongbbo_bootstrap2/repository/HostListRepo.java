package com.example.bbosongbbo_bootstrap2.repository;

import com.example.bbosongbbo_bootstrap2.entity.HostList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostListRepo extends JpaRepository<HostList, String> {

    HostList findByHostIp(String hostIp);

}
