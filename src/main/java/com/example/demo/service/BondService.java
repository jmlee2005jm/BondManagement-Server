package com.example.demo.service;

import com.example.demo.controller.BondTO;
import com.example.demo.domain.Bond;
import com.example.demo.repository.BondRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class BondService {

    private static final Logger logger = LoggerFactory.getLogger("BondService");
    private final BondRepository bondRepository;

    public List<BondTO> getBondList(Long creditorId) {
        logger.info("getBondList");
        List<Bond> bondList = bondRepository.findBondsByCreditorId(creditorId);
        List<BondTO> bondTOList = bondList.stream().map(BondTO::new).collect(toList());
        return bondTOList;
    }
}
