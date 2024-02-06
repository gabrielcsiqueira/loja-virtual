package com.example.lojavirtual.model;

import com.example.lojavirtual.enums.StatusContaPagar;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "conta_pagar")
@SequenceGenerator(name = "seq_conta_pagar", sequenceName = "seq_conta_pagar", allocationSize = 1, initialValue = 1)
public class ContaPagar implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_pagar")
    private Long id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "valor_total")
    private BigDecimal ValorTotal;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_vencimento")
    private Date dateVencimento;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_pagamento")
    private Date datePagamento;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusContaPagar status;
    @Column(name = "valor_desconto")
    private BigDecimal valorDesconto;
    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;
    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_fornecedor_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fornecedor_fk"))
    private Pessoa pessoa_fornecedor;

}
