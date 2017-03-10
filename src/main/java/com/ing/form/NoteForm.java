package com.ing.form;

import com.ing.domain.CurrentDate;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

/**
 * Created by pawel on 03.03.17.
 */


public class NoteForm {

    @NotEmpty(message = "Podaj tytuł notatki")
    private String name;
    @NotEmpty(message = "Podaj treść notatki")
    private String text;
    private Long clientId;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

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

    public CurrentDate currentDate = new CurrentDate();

    public Date getDate() {
        return currentDate.currentDate();
    }

    @Override
    public String toString() {
        return "NoteForm{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}



