package com.ing.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by pawel on 03.03.17.
 */

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)

    @Column(name = "id",unique=true, nullable = false)
    private int id;
    private String name;
    private String text;
    private Date date;
    @ManyToOne
    private Client clientId;


    public Note() {
    }

    public Note(  String name, String text, Date date, Client clientId) {

        this.name = name;
        this.text = text;
        this.date = date;
        this.clientId = clientId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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
