package com.ing.csvreader;

import com.ing.controller.ClientController;
import com.ing.domain.Client;
import com.ing.parser.Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman on 2017-03-06.
 */
@Component
public class CSVProcessor {
    public CSVReader reader = new CSVReader();
List<Client> clients = new ArrayList<>();
    @Autowired
    private Parser parser ;

    public void parse(){



         clients = parser.parse(reader.read());



        // TODO: 2017-03-07     podłaczyc repozytorium przez autowired
//        ClientController clientController = new ClientController();
//        clientController.addNewClient();
    }

}
