package com.ing.csvwriter;

import com.ing.domain.Client;
import com.ing.repository.ClientRepository;
import javafx.animation.SequentialTransition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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

    public Set<String> getAllBranches() {
        Set<String> branches = new HashSet<>();
        clientRepository.findAll().forEach(Client -> branches.add(Client.getBranch()));
        return branches;
    }

}
