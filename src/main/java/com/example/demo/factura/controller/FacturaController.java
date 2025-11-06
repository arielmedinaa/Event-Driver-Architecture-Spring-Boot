package com.example.demo.factura.controller;

import com.example.demo.factura.model.FacturaModel;
import com.example.demo.factura.service.FacturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/factura")
public class FacturaController {

    private final FacturaService service;

    @PostMapping
    private String create(@RequestBody FacturaModel facturaModel) {
        return service.save(facturaModel);
    }
}
