package com.example.demo.modules.factura.model.dto;

import com.example.demo.modules.cobros.model.CobrosModel;

public record FacturaGrabDTO(
        String numero
        , Long timbrado
        , Double total
        , String fechaEmision
        , CobrosModel cobros
) {
}
