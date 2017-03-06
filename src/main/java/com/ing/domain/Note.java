package com.ing.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by pawel on 03.03.17.
 */

@Entity
public class Note {
    @Id
    @Column
    private Long id;
    private String name;
    private String text;
    private Date date;
    @ManyToOne
    private Client clientId;

    public Note(Long id, String name, String text, Date date, Client clientId) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.date = date;
        this.clientId = clientId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", clientId=" + clientId +
                '}';
    }
}
