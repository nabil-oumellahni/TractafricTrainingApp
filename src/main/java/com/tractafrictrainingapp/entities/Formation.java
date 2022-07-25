package com.tractafricapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedHashMap;

/**
 * @author N.Oumellahni
 * at 1:37 PM - 7/21/2022
 */
@Entity
@Data
@AllArgsConstructor
@ToString
public class Formation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false)
    private Long id;
    private LinkedHashMap<String , String> type;
    private String code;
    private String nom;
    private String date_debut;
    private String date_fin;

    public Formation() {
        // populate country option : used ISO country code
        type = new LinkedHashMap<>();
        type.put("TECHNIQUE" , "Formation Technique");   //key or code / value or label
        type.put("CONDUITE" , "Formation Conduite");
        type.put("EN LIGNE" , "Formation en ligne");
    }
}
