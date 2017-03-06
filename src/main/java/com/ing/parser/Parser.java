package com.ing.parser;

import com.ing.csvreader.CSVReader;

/**
 * Created by Roman on 2017-03-06.
 */
public class Parser {
    public String clientNumber;
    public String clientName;
    public String clientRegion;
    public String clientBranch;
    public String clientPhone;
    public String clientEmail;
    public String clientEstablishDate;

    public Parser() {
    }

    public Parser(String clientNumber, String clientName, String clientRegion, String clientBranch,
                  String clientPhone, String clientEmail, String clientEstablishDate) {
        this.clientNumber = clientNumber;
        this.clientName = clientName;
        this.clientRegion = clientRegion;
        this.clientBranch = clientBranch;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.clientEstablishDate = clientEstablishDate;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientRegion() {
        return clientRegion;
    }

    public void setClientRegion(String clientRegion) {
        this.clientRegion = clientRegion;
    }

    public String getClientBranch() {
        return clientBranch;
    }

    public void setClientBranch(String clientBranch) {
        this.clientBranch = clientBranch;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientEstablishDate() {
        return clientEstablishDate;
    }

    public void setClientEstablishDate(String clientEstablishDate) {
        this.clientEstablishDate = clientEstablishDate;
    }

    @Override
    public String toString() {
        return "Parser{" +
                "clientNumber='" + clientNumber + '\'' +
                ", clientName='" + clientName + '\'' +
                ", clientRegion='" + clientRegion + '\'' +
                ", clientBranch='" + clientBranch + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientEstablishDate='" + clientEstablishDate + '\'' +
                '}';
    }
}

