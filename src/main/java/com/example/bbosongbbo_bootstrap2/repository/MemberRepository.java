package com.example.bbosongbbo_bootstrap2.repository;

import com.example.bbosongbbo_bootstrap2.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

//CrudRepository 또는 JpaRepository 상속.
//엔터티 --> 테이블명인 MemberEntity
public interface MemberRepository extends JpaRepository<Member,Integer> {

}
