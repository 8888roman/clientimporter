package com.ing.csvreader;

import com.ing.parser.Parser;

/**
 * Created by Roman on 2017-03-06.
 */
public class CSVProcessor {
    public CSVReader reader = new CSVReader();

    public Parser parser = new Parser();

    public void parse(){
        reader.read();
       parser.setClientName(reader.klient[0]);
       
    }

}
