package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.entity.Member;

public class itemDTO {

    private int num;
    private String title;
    private String item;
    private String author;



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


    @Override
    public String toString() {
        return "itemDTO{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", item='" + item + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    //toEntity()

    public Member toEntity(){

        return new Member(num, title, item, author);
    }
}
