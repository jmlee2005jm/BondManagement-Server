package com.example.demo.controller;

import com.example.demo.service.BondService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping(value = "/bonds")
public class BondController {

    private static final Logger logger = LoggerFactory.getLogger("BondController");
    private final BondService bondService;

    @GetMapping(value = "/{id}")
    public List<BondTO> getBondList(@PathVariable Long id) {
        List<BondTO> bondTOList = bondService.getBondList(id);
        logger.info("getBondList" + bondTOList.size());
        return bondTOList;
    }
}