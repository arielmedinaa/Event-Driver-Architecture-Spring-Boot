package com.example.demo.factura.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FacturaModel {
    Long id;
    String numero;
    Long timbrado;
    String fechaEmision;
    Double total;
}
