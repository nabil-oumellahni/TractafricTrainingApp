package com.tractafricapp.controllers;

import com.tractafricapp.entities.Client;
import com.tractafricapp.entities.Formateur;
import com.tractafricapp.services.ClientService;
import com.tractafricapp.services.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author N.Oumellahni
 * at 12:12 PM - 7/23/2022
 */

@RestController
@RequestMapping("/formateur")
public class FormateurController {
    @Autowired
    private FormateurService formateurService;


    @GetMapping("/all")
    public ResponseEntity<List<Formateur>> getAllFormateurs() {
        List<Formateur> formateurs = formateurService.findAllFormateurs();
        return new ResponseEntity<>(formateurs , HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Formateur> getCFormateurById(@PathVariable(name = "id") Long id) {
        Formateur formateur = formateurService.findFormateurById(id);
        return new ResponseEntity<>(formateur , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Formateur> addFormateur(@RequestBody Formateur formateur) {
        Formateur newFormateur = formateurService.addFormateur(formateur);
        return new ResponseEntity<>(newFormateur , HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Formateur> updateFormateur(@RequestBody Formateur formateur) {
        Formateur updateFormateur = formateurService.updateFormateur(formateur);
        return new ResponseEntity<>(updateFormateur , HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFormateur(@PathVariable(name = "id") Long id) {
        formateurService.deleteFormateur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
