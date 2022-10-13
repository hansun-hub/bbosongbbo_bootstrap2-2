package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.entity.Member;

public class itemDTO {

    private int num;
    private String schedule_run_date;

    private String schedule_id;
    private String shell_num;



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


    @Override
    public String toString() {
        return "itemDTO{" +
                "num=" + num +
                ", schedule_run_date='" + schedule_run_date + '\'' +
                ", schedule_id='" + schedule_id + '\'' +
                ", shell_num='" + shell_num + '\'' +
                '}';
    }

    //toEntity()

    public Member toEntity(){

        return new Member(num, schedule_run_date, schedule_id, shell_num);
    }
}
