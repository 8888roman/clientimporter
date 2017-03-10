package com.ing.csvwriter;

import com.ing.domain.Client;
import com.ing.repository.ClientRepository;
import javafx.animation.SequentialTransition;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Roman on 2017-03-09.
 */
public class CSVRaporter {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> allBranches() {
        return (List<Client>) clientRepository.findAll();
    }


}
