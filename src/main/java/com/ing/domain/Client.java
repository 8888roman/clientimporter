package com.ing.domain;

/**
 * Created by pawel on 03.03.17.
 */
public class Client {
    private int clientNumber;
    private String name;
    private String region;
    private String branch;
    private long phoneNumber;
    private String email;
    private String dateOfEstablish;


    public Client(int clientNumber, String name, String region, String branch, long phoneNumber, String email, String dateOfEstablish) {
        this.clientNumber = clientNumber;
        this.name = name;
        this.region = region;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfEstablish = dateOfEstablish;
    }

    public long getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
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

    public String getDateOfEstablish() {
        return dateOfEstablish;
    }

    public void setDateOfEstablish(String dateOfEstablish) {
        this.dateOfEstablish = dateOfEstablish;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientNumber=" + clientNumber +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", branch='" + branch + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", dateOfEstablish='" + dateOfEstablish + '\'' +
                '}';
    }
}
