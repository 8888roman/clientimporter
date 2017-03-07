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
    public CSVReader reader = new CSVReader(); //autowired

    //public Parser parser;
    @Autowired
    private Parser parser;

    public void parse(){
//        reader.read();

     //   new Parser();
// TODO: 2017-03-07 przekazac tablice stringów zamiast pojedynczych
        parser.parse(reader.read());


        // TODO: 2017-03-07     podłaczyc repozytorium przez autowired
//        ClientController clientController = new ClientController();
//        clientController.addNewClient();
    }

}
