package com.example.demo.controller;

import com.example.demo.domain.Bond;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BondTO {
    private Long creditorId;
    private Long debtorId;
    private Integer calculatedBond;

    public BondTO(Bond bond) {
        creditorId = bond.getCreditorId();
        debtorId = bond.getDebtorId();
        calculatedBond = bond.getCalculatedBond();
    }
}
