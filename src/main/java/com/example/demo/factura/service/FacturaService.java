package com.example.demo.factura.service;

import com.example.demo.factura.events.FacturaEvent;
import com.example.demo.factura.model.FacturaModel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FacturaService {
    private final ApplicationEventPublisher publisher;

    public String save(FacturaModel factura) {
        publisher.publishEvent(new FacturaEvent(this, factura));
        return factura.getNumero();
    }
}
