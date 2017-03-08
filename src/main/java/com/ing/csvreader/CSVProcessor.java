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
    @Autowired
    private ClientRepository clientRepository;

    public CSVReader reader = new CSVReader();
    List<Client> clients = new ArrayList<Client>();

    @Autowired
    private Parser parser;


    public List<Client> parse() {

        clients = parser.parse(reader.read());

        return clients;


    }

    public void save(List<Client> clients) {
        for (Client c : clients) {
            clientRepository.save(c);
        }
    }

}
