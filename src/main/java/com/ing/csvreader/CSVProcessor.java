package com.ing.csvreader;

import com.ing.controller.ClientController;
import com.ing.domain.Client;
import com.ing.parser.Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Roman on 2017-03-06.
 */
public class CSVProcessor {
    public CSVReader reader = new CSVReader();

    //public Parser parser;
    @Autowired
    private Parser parser;

    public void parse(){
        reader.read();

        new Parser(reader.klient[0], reader.klient[1], reader.klient[2], reader.klient[3], reader.klient[4], reader.klient[5], reader.klient[6]);

        parser.parse();

        ClientController clientController = new ClientController();
        clientController.addNewClient();
    }

}
