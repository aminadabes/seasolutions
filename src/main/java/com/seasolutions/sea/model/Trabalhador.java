package com.seasolutions.sea.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Trabalhador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trabalhador_id")
    private long id;

    private String nome;

    private String cpf;

    private String sexo;

    private Setor setor;

    private Cargo cargo;
}
