package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.entity.Member;

import javax.persistence.criteria.CriteriaBuilder;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class itemDTO {

    private int num;
    private String schedule_run_date;

    private String schedule_id;
    private String shell_num;
    private String schedule_duration;
    private Integer schedule_repeat;


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

    public void setShell_num(String shell_num) {
        this.shell_num = shell_num;
    }

    public String getSchedule_duration() {
        return schedule_duration;
    }

    public void setSchedule_duration(String schedule_duration) {
        this.schedule_duration = schedule_duration;
    }

    public Integer getSchedule_repeat() { return schedule_repeat; }
    public void setSchedule_repeat(Integer schedule_repeat) {
        this.schedule_repeat = schedule_repeat;
    }

    @Override
    public String toString() {
        return "itemDTO{" +
                "num=" + num +
                ", schedule_run_date='" + schedule_run_date + '\'' +
                ", schedule_id='" + schedule_id + '\'' +
                ", shell_num='" + shell_num + '\'' +
                ", schedule_duration='" + schedule_duration + '\'' +
                ", schedule_repeat='" + schedule_repeat + '\'' +
                '}';
    }

    //toEntity()

    public Member toEntity(){

        return new Member(num, schedule_run_date, schedule_id, shell_num,schedule_duration,schedule_repeat);
    }
}
