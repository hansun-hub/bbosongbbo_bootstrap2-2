package com.example.bbosongbbo_bootstrap2.entity;

import com.example.bbosongbbo_bootstrap2.domain.BaseTimeEntity;
import com.example.bbosongbbo_bootstrap2.domain.MemberTimeEntity;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class Member extends MemberTimeEntity {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;

    @Column
    private String schedule_run_date;

    @Column
    private String schedule_id;

    @Column
    private String shell_num;

    @Column
    private String schedule_duration;

    @Column
    private Integer schedule_repeat;

//    public Member(int num, String schedule_run_date, String schedule_id, String shell_num) {
//    }
    /*
    @javax.persistence.Id
    private Long id;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }*/

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSchedule_run_date() {
        return schedule_run_date;
    }

    public void setSchedule_run_date(String schedule_run_date) {
        this.schedule_run_date = schedule_run_date;
    }

    public String getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(String schedule_id) {
        this.schedule_id = schedule_id;
    }

    public String getShell_num() {
        return shell_num;
    }

    public void setShell_num(String author) {
        this.shell_num = shell_num;
    }

    public String schedule_duration() {
        return schedule_duration;
    }

    public void schedule_duration(String schedule_duration) {
        this.schedule_duration = schedule_duration;
    }

    public Integer getSchedule_repeat() {
        return schedule_repeat;
    }

    public void setSchedule_duration(Integer schedule_repeat) {
        this.schedule_repeat = schedule_repeat;
    }




    //Constructor
    public Member(){ }

    public Member(int num, String schedule_run_date, String schedule_id, String shell_num,String schedule_duration,Integer schedule_repeat) {
        this.num = num;
        this.schedule_run_date = schedule_run_date;
        this.schedule_id = schedule_id;
        this.shell_num = shell_num;
        this.schedule_duration=schedule_duration;
        this.schedule_repeat = schedule_repeat;
    }

    //toString()
    @Override
    public String toString() {
        return "Member{" +
                "num=" + num +
                ", schedule_run_date='" + schedule_run_date + '\'' +
                ", schedule_id='" + schedule_id + '\'' +
                ", shell_num='" + shell_num + '\'' +
                ", schedule_duration='" + schedule_duration + '\'' +
                ", schedule_repeat='" + schedule_repeat + '\'' +
                '}';
    }


}
