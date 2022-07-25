package com.tractafricapp.dao;

import com.tractafricapp.entities.Formateur;
import com.tractafricapp.entities.Formation;
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
 * at 12:04 PM - 7/23/2022
 */

@CrossOrigin("*")
@RepositoryRestResource
public interface FormateurRepository extends JpaRepository<Formateur, Long> {
        @RestResource(path = "/byNom")
        public List<Formateur> findByNomContains(@Param("mc") String nom);

        @RestResource(path = "/byNomPage")
        public Page<Formateur> findByNomContains(@Param("mc") String nom , Pageable pageable);
}
