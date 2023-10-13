package com.example.lojavirtual.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Objects;

@Data
@Entity
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa{

    private static final long serialVersionUID = 1l;
    @Column(name = "cpf", nullable = false)
    private String cpf;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento")
    private Date dataNascimento;

}
