package com.ing.parser;

import com.ing.csvreader.CSVReader;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Roman on 2017-03-06.
 */
@Component
public class Parser {
    public String clientNumber;
    public String clientPhone;
    public String clientEstablishDate;
    public Long clientNumberParsed;
    public Long clientPhoneParsed;
    public Date clientEstablishDateParsed;
    public String clientName;
    public String clientRegion;
    public String clientBranch;
    public String clientEmail;


    public Parser() {
    }

    public Parser(String clientNumber, String clientName, String clientRegion, String clientBranch, String clientPhone, String clientEmail,
                  String clientEstablishDate) {
        this.clientNumber = clientNumber;
        this.clientName = clientName;
        this.clientRegion = clientRegion;
        this.clientBranch = clientBranch;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.clientEstablishDate = clientEstablishDate;
    }


    public void parse(){
        clientNumberParsed = Long.parseLong(clientNumber);
        clientPhoneParsed = Long.parseLong(clientPhone);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {

            clientEstablishDateParsed = formatter.parse(clientEstablishDate);
            System.out.println(clientEstablishDateParsed);
            System.out.println(formatter.format(clientEstablishDateParsed));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientEstablishDate() {
        return clientEstablishDate;
    }

    public void setClientEstablishDate(String clientEstablishDate) {
        this.clientEstablishDate = clientEstablishDate;
    }

    public Long getClientNumberParsed() {
        return clientNumberParsed;
    }

    public void setClientNumberParsed(Long clientNumberParsed) {
        this.clientNumberParsed = clientNumberParsed;
    }

    public Long getClientPhoneParsed() {
        return clientPhoneParsed;
    }

    public void setClientPhoneParsed(Long clientPhoneParsed) {
        this.clientPhoneParsed = clientPhoneParsed;
    }

    public Date getClientEstablishDateParsed() {
        return clientEstablishDateParsed;
    }

    public void setClientEstablishDateParsed(Date clientEstablishDateParsed) {
        this.clientEstablishDateParsed = clientEstablishDateParsed;
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

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    @Override
    public String toString() {
        return "Parser{" +
                "clientNumber='" + clientNumber + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientEstablishDate='" + clientEstablishDate + '\'' +
                ", clientNumberParsed=" + clientNumberParsed +
                ", clientPhoneParsed=" + clientPhoneParsed +
                ", clientEstablishDateParsed=" + clientEstablishDateParsed +
                ", clientName='" + clientName + '\'' +
                ", clientRegion='" + clientRegion + '\'' +
                ", clientBranch='" + clientBranch + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                '}';
    }
}

