package com.ing.csvreader;

import com.ing.controller.ClientController;
import com.ing.domain.Client;
import com.ing.parser.Parser;
import com.ing.repository.ClientRepository;
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

    @Autowired
    private Parser parser ;
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> parse(){

        List<Client>  clients = parser.parse(reader.read());
        for(Client c : clients) { clientRepository.save(c); }
    return clients;


        // TODO: 2017-03-07     podłaczyc repozytorium przez autowired
//        ClientController clientController = new ClientController();
//        clientController.addNewClient();
    }

}
