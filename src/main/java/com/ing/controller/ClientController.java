package com.ing.controller;

import com.ing.csvreader.CSVProcessor;
import com.ing.domain.Client;
import com.ing.parser.Parser;
import com.ing.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

/**
 * Created by Roman on 2017-03-06.
 */
@Controller
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private Parser parser;



}