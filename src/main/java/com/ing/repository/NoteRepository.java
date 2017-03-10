package com.ing.repository;

import com.ing.domain.Note;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Roman on 2017-03-08.
 */

public interface NoteRepository extends CrudRepository<Note, Long> {
    List<Note> findById(Long id);
}
