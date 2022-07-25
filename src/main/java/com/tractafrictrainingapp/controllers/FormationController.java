package com.tractafricapp.controllers;

import com.tractafricapp.entities.Formation;
import com.tractafricapp.services.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author N.Oumellahni
 * at 1:51 PM - 7/21/2022
 */

@RestController
@RequestMapping("/formation")
public class FormationController {
    @Autowired
    private FormationService formationService;


    @GetMapping("/all")
    public ResponseEntity<List<Formation>> getAllClients() {
        List<Formation> formations = formationService.findAllFormations();
        return new ResponseEntity<>(formations , HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Formation> getFormationById(@PathVariable(name = "id") Long id) {
        Formation formation = formationService.findFormationById(id);
        return new ResponseEntity<>(formation , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Formation> addFormation(@RequestBody Formation formation) {
        Formation newFormation = formationService.addFormation(formation);
        return new ResponseEntity<>(newFormation , HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Formation> updateClient(@RequestBody Formation formation) {
        Formation updateFormation = formationService.updateFormation(formation);
        return new ResponseEntity<>(updateFormation , HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFormation(@PathVariable(name = "id") Long id) {
        formationService.deleteFormation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
