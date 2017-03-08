package com.ing.domain;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Roman on 2017-03-08.
 */
public class CurrentDate {


        private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


        public Date currentDate (){

            Date date = new Date();
            System.out.println(sdf.format(date));

            return date;

        }

    }
