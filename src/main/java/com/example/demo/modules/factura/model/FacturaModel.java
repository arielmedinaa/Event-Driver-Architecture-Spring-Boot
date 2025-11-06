package com.example.demo.modules.factura.model;

import com.example.demo.modules.cobros.model.CobrosModel;
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
