package com.example.demo.modules.factura.service;

import com.example.demo.modules.factura.events.FacturaEvent;
import com.example.demo.modules.factura.model.FacturaModel;
import com.example.demo.modules.factura.model.dto.FacturaGrabDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FacturaService {
    private final ApplicationEventPublisher publisher;

    public String save(FacturaGrabDTO factura) {
        publisher.publishEvent(new FacturaEvent(this, factura));
        return factura.numero();
    }
}
