package com.ing.csvwriter;

import com.ing.repository.ClientRepository;
import com.ing.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Roman on 2017-03-09.
 */
public class CSVRaporter {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private NoteRepository noteRepository;


}
