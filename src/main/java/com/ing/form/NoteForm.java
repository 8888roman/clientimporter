package com.ing.form;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by pawel on 03.03.17.
 */


public class NoteForm {

    @NotEmpty(message = "Podaj tytuł notatki")
    private String name;
    @NotEmpty(message = "Podaj treść notatki")
    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "NoteForm{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}



