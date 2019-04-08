package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class Bond {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "creditor_id", columnDefinition = "bingint", nullable = false)
    private Long creditorId;

    @Column(name = "debtor_id", columnDefinition = "bingint", nullable = false)
    private Long debtorId;

    @Column(name = "calculated_bond", columnDefinition = "int", nullable = false)
    private Integer calculatedBond;

    @Builder
    public Bond(Long creditorId, Long debtorId, Integer calculatedBond) {
        this.creditorId = creditorId;
        this.debtorId = debtorId;
        this.calculatedBond = calculatedBond;
    }
}
