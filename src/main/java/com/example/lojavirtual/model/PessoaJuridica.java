package com.example.lojavirtual.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa {

    private static final long serialVersionUID = 1L;

    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "inscricao_estadual")
    private String inscricaoEstadual;
    @Column(name = "inscricao_municipal")
    private String inscricaoMunicipal;
    @Column(name = "nome_fantasia")
    private String nomeFantasia;
    @Column(name = "razao_social")
    private String razaoSocial;
    @Column(name = "categoria")
    private String categoria;


}
