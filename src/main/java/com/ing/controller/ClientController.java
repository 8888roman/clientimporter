package com.ing.controller;

import com.ing.csvreader.CSVProcessor;
import com.ing.domain.Client;
import com.ing.parser.Parser;
import com.ing.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

/**
 * Created by Roman on 2017-03-06.
 */
@Controller
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;



    @RequestMapping(value = "/clientlist", method = RequestMethod.GET)
    public String showAllClients(Model model) {
        model.addAttribute("clients", clientRepository.findAll());
        return "clientlist";
    }

    @RequestMapping(value= "/clientdetails/{id}", method=RequestMethod.GET)
    public String showClientDetails(Client client, @PathVariable("id") Long id, Model model) {
        model.addAttribute("clients", clientRepository.findOne(id));
        return "clientdetails";
    }

    @RequestMapping(value= "/clientdetails/{id}/note", method=RequestMethod.GET)
    public String addNote(Client client, @PathVariable("id") Long id, Model model) {
        model.addAttribute("clients", clientRepository.findOne(id));
        return "note";
    }

    @Configuration
    @EnableWebMvc
    public class WebConfig extends WebMvcConfigurerAdapter {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
    }
}
