package com.example.demo.modules.factura.events;

import com.example.demo.modules.factura.model.dto.FacturaGrabDTO;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class FacturaEvent extends ApplicationEvent {
    private final FacturaGrabDTO facturaModel;

    public FacturaEvent(Object source, FacturaGrabDTO facturaModel) {
        super(source);
        this.facturaModel = facturaModel;
    }

}
