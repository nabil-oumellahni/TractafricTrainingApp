package com.tractafricapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author N.Oumellahni
 * at 10:53 AM - 7/22/2022
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false)
    private Long id;
    private String titre;
}
