package com.example.bbosongbbo_bootstrap2.repository;

import com.example.bbosongbbo_bootstrap2.entity.HostList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HostListRepoTest {

    @Autowired
    HostListRepo hostListRepo;

    @Test
    void findByHostIp() {
        HostList hostList = hostListRepo.findByHostIp("172.31.14.172");
        System.out.println(hostList);
    }
}