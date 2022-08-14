package com.challenge.apialticci.controller;

import com.challenge.apialticci.service.AlticciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("alticci")
public class AlticciController {

    @Autowired
    AlticciService alticciService;

    @GetMapping("/{n}")
    public List<BigDecimal> sequenceChallenge(@PathVariable Integer n){
        return alticciService.listAlticci(n);
    }
}
