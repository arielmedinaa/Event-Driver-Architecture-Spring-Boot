package com.example.demo.modules.factura.controller;

import com.example.demo.modules.factura.model.dto.FacturaGrabDTO;
import com.example.demo.modules.factura.service.FacturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/factura")
public class FacturaController {

    private final FacturaService service;

    @PostMapping
    private String create(@RequestBody FacturaGrabDTO facturaModel) {
        return service.save(facturaModel);
    }
}
