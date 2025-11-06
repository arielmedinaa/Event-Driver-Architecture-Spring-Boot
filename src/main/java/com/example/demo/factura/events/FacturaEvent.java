package com.example.demo.factura.events;

import com.example.demo.factura.model.FacturaModel;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class FacturaEvent extends ApplicationEvent {
    private final FacturaModel facturaModel;

    public FacturaEvent(Object source, FacturaModel facturaModel) {
        super(source);
        this.facturaModel = facturaModel;
    }

}
