package com.tractafricapp.services;

import com.tractafricapp.dao.FormateurRepository;
import com.tractafricapp.dao.FormationRepository;
import com.tractafricapp.entities.Formateur;
import com.tractafricapp.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author N.Oumellahni
 * at 12:07 PM - 7/23/2022
 */
@Service
public class FormateurService {
    @Autowired
    private FormateurRepository formateurRepository;

    public List<Formateur> findAllFormateurs() {
        return formateurRepository.findAll();
    }

    public Formateur findFormateurById(Long id) {
        return  formateurRepository.findById(id).get();
    }

    public Formateur addFormateur (@RequestBody Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    public Formateur updateFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    public void deleteFormateur(Long id) {
        formateurRepository.deleteById(id);
    }

}
