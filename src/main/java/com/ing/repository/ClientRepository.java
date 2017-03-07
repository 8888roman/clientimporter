package com.ing.repository;

import com.ing.domain.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Roman on 2017-03-06.
 */
public interface ClientRepository extends CrudRepository<Client,Long > {
    List<Client> findById(Long id);



}
