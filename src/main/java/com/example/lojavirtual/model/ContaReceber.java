package com.example.lojavirtual.model;

import com.example.lojavirtual.enums.StatusContaReceber;
import com.example.lojavirtual.enums.TipoEndereco;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "conta_receber")
@SequenceGenerator(name = "seq_conta_receber", sequenceName = "seq_conta_receber", allocationSize = 1, initialValue = 1)
public class ContaReceber implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_receber")
    private Long id;
    @Column(name = "descricao")
    private String descricao;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusContaReceber status;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_vencimento")
    private Date dateVencimento;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_pagamento")
    private Date datePagamento;
    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    @Column(name = "valor_desconto")
    private BigDecimal valorDesconto;
    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;

}
