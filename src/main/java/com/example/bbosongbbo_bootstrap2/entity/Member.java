package com.example.bbosongbbo_bootstrap2.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Member {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;

    @Column
    private String title;

    @Column
    private String item;

    @Column
    private String author;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Constructor
    public Member(){ }

    public Member(int num, String title, String item, String author) {
        this.num = num;
        this.title = title;
        this.item = item;
        this.author = author;
    }

    //toString()
    @Override
    public String toString() {
        return "Member{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", item='" + item + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
