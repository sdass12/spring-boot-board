package com.hhk.board.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class BoardVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int bno;
    private int total;
    private String title;
    private String content;
    private String date;
    private String writer;
    private String password;


    public int getBno(){
        return bno;
    }

    public void setBno(int bno){
        this.bno=bno;
    }

    public int getTotal(){
        return total;
    }

    public void setTotal(int total){
        this.total=total;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content=content;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date=date;
    }

    public String getWriter(){
        return writer;
    }

    public void setWriter(String writer){
        this.writer=writer;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

}
