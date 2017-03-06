package com.ing.parser;

import com.ing.csvreader.CSVReader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Roman on 2017-03-06.
 */
public class Parser {
    public String clientNumber;
    public String clientPhone;
    public String clientEstablishDate;
    public Long clientNumberParsed;
    public Long clientPhoneParsed;
    public Date clientEstablishDateParsed;

    public Parser() {
    }

    public Parser(String clientNumber, String clientPhone, String clientEstablishDate) {
        this.clientNumber = clientNumber;
        this.clientPhone = clientPhone;
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

    @Override
    public String toString() {
        return "Parser{" +
                "clientNumber='" + clientNumber + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientEstablishDate='" + clientEstablishDate + '\'' +
                '}';
    }
}

