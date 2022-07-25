package com.tractafricapp.dao;

import com.tractafricapp.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * @author N.Oumellahni
 * at 1:28 PM - 7/20/2022
 */

@CrossOrigin("*")
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client , Long> {
    @RestResource(path = "/byNom")
    public List<Client> findByNomContains(@Param("mc") String nom);

    @RestResource(path = "/byNomPage")
    public Page<Client> findByNomContains(@Param("mc") String nom , Pageable pageable);
}
