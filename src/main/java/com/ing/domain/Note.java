package com.ing.domain;

import java.util.Date;

/**
 * Created by pawel on 03.03.17.
 */
public class Note {
    private String name;
    private String text;
    private Date date;

    public Note(String name, String text, Date date) {
        this.name = name;
        this.text = text;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
