package com.example.demo.modules.cobros.service;

import com.example.demo.modules.cobros.model.CobrosModel;
import org.springframework.stereotype.Service;

@Service
public class CobrosService {

    public void cobrar(CobrosModel cobrosModel) {
        System.out.println("cobrando" + cobrosModel);
    }
}
