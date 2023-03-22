package com.example.demo.service;

import com.example.demo.model.Coche;
import com.example.demo.repository.CocheInterfase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocheService {

    @Autowired
    private CocheInterfase cocheInterfase;

    public  void saveObject(List<Coche> coche){
        cocheInterfase.saveAll(coche);

        cocheInterfase.findAll().stream().forEach(data -> System.out.println(data.getMarca()));

    }
}
