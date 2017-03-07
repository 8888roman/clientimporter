package com.ing.scheduler;

import com.ing.csvreader.CSVProcessor;
import com.ing.csvreader.CSVReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;


/**
 * Created by Roman on 2017-03-06.
 */

@Component
public class Scheduler {

    private static final Logger log = LoggerFactory.getLogger(Scheduler.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public CSVProcessor csvProcessor = new CSVProcessor();


    @Scheduled(fixedRate = 5000)
     public void czytaj(){
        csvProcessor.parse();}
//    public void reportCurrentTime() {
//
//       log.info("The time is now {}", dateFormat.format(new Date()));
//
//
//}




}