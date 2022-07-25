package com.tractafricapp.services;

import com.tractafricapp.dao.FormationRepository;
import com.tractafricapp.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

/**
 * @author N.Oumellahni
 * at 1:46 PM - 7/21/2022
 */

@Service
public class FormationService {
    @Autowired
    private FormationRepository formationRepository;

    public List<Formation> findAllFormations() {
        return formationRepository.findAll();
    }


    public Formation findFormationById(Long id) {
        return  formationRepository.findById(id).get();
    }

    public Formation addFormation (@RequestBody Formation formation) {
        return formationRepository.save(formation);
    }

    public Formation updateFormation(Formation f) {
        return formationRepository.save(f);
    }

    public void deleteFormation(Long id) {
        formationRepository.deleteById(id);
    }

}
