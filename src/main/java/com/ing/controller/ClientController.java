package com.ing.controller;


import com.ing.domain.Client;
import com.ing.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



/**
 * Created by Roman on 2017-03-06.
 */
@Controller
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showAll(Model model) {

        return "index";
    }

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

//    @RequestMapping(value = "clientlist1", method = RequestMethod.GET)
//    public @ResponseBody Iterable<Client> branchQuery(@RequestParam ("query") String branchQuery){
//        return clientRepository.findByBranchIgnoreCaseContaining(branchQuery);
//    }

    @Configuration
    @EnableWebMvc
    public class WebConfig extends WebMvcConfigurerAdapter {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
    }
}
