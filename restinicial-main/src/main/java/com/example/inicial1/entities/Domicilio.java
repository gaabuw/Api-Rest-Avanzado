package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;
    private int numero;

    @ManyToOne
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
