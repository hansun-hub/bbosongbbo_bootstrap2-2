package com.example.bbosongbbo_bootstrap2.repository;

import com.example.bbosongbbo_bootstrap2.entity.vuln_result_list;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface vuln_result_listRepository extends JpaRepository<vuln_result_list, Integer> {

    @Query("SELECT p FROM vuln_result_list p ORDER BY p.id DESC")
    List<vuln_result_list> findAllDesc();

    List<vuln_result_list> findFirst31ByOrderByIdDesc();
}
