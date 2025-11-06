package com.example.demo.modules.cobros.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CobrosModel {
    Long id;
    String nro;
    Double monto;
    String fecha;
    String estado;
}
