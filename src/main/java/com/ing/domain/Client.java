package com.ing.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by pawel on 03.03.17.
 */
@Entity
public class Client {
    @Id
    @Column(name ="id")
    public long id;
    private String name;
    private String region;
    private String branch;
    private long phoneNumber;
    private String email;
    private Date dateOfEstablish;
    @OneToMany(mappedBy = "clientId")
    private List<Note> noteList;

    public Client() {
    }

    public Client(long id, String name, String region, String branch, long phoneNumber, String email, Date dateOfEstablish) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfEstablish = dateOfEstablish;
    }

    public long getClientNumber() {
        return id;
    }

    public void setClientNumber(long clientNumber) {
        this.id = clientNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfEstablish() {
        return dateOfEstablish;
    }

    public void setDateOfEstablish(Date dateOfEstablish) {
        this.dateOfEstablish = dateOfEstablish;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientNumber=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", branch='" + branch + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", dateOfEstablish='" + dateOfEstablish + '\'' +
                '}';
    }
}
