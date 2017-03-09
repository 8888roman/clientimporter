package com.ing.controller;

import com.ing.csvreader.CSVProcessor;
import com.ing.domain.Client;
import com.ing.domain.Note;
import com.ing.form.NoteForm;
import com.ing.parser.Parser;
import com.ing.repository.ClientRepository;
import com.ing.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

/**
 * Created by Roman on 2017-03-06.
 */
@Controller
public class NoteController {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private NoteRepository noteRepository;


    @RequestMapping(value = "/clientdetails/{id}/note", method = RequestMethod.GET)
    public String showClientDetails(NoteForm noteForm, @PathVariable("id") Long id, Model model) {
        model.addAttribute("clients", clientRepository.findOne(id));
        return "note";
    }

    @RequestMapping(value = "/clientdetails/{id}/note", method = RequestMethod.POST)
    public String addNewNote(@ModelAttribute("noteForm") @Valid NoteForm noteForm, BindingResult bindingResult, Model model, @PathVariable(name = "id") Long id) {
       model.addAttribute("noteForm", new NoteForm() );
        model.addAttribute("clients", clientRepository.findOne(id));
        if (bindingResult.hasErrors()) {
            return "/clientlist";
        }


        noteRepository.save(new Note(
                noteForm.getName(),
                noteForm.getText(),
                noteForm.getDate(),
                clientRepository.findOne(id)
        ));

        return "redirect:/clientdetails";
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
