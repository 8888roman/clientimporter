package com.ing.controller;

import com.ing.domain.Client;
import com.ing.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Roman on 2017-03-06.
 */
@Controller
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    public void save() {
        clientRepository.save(new Client());
    }
}
// TODO: 2017-03-06 zapis do bazy 