package com.ing.csvreader;

import com.ing.controller.ClientController;
import com.ing.domain.Client;
import com.ing.parser.Parser;

/**
 * Created by Roman on 2017-03-06.
 */
public class CSVProcessor {
    public CSVReader reader = new CSVReader();



    public void parse(){
        reader.read();
        Parser parser = new Parser(reader.klient[0], reader.klient[1], reader.klient[2], reader.klient[3], reader.klient[4], reader.klient[5], reader.klient[6]);

        parser.parse();

        ClientController clientController = new ClientController();
        clientController.addNewClient(parser);
    }

}
