package com.tractafricapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author N.Oumellahni
 * at 1:21 PM - 7/20/2022
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false)
    private Long id;
    private String nom;
    private String prenom;
    private double num_tel;
    private String email;
    private String type;
    private String compagnie;
    private String pays;
    @Column(nullable = false , updatable = false)
    private String codeClient;
}
