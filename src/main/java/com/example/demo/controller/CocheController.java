package com.example.demo.controller;

import com.example.demo.model.Coche;
import com.example.demo.service.CocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/coche")
public class CocheController {

    @Autowired
    private CocheService cocheService;

    @GetMapping
    public String cretaeObject(){

        Coche coche = new Coche();
        coche.setMarca("Toyota");

        Coche coche2 = new Coche();
        coche2.setMarca("Mazda");

        Coche coche3 = new Coche();
        coche3.setMarca("Chevrolet");

        List<Coche> cochesSave = new ArrayList<>();
        cochesSave.add(coche);
        cochesSave.add(coche2);

        cocheService.saveObject(cochesSave);
        return "grabo";
    }
}
