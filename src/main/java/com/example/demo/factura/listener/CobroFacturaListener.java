package com.example.demo.factura.listener;

import com.example.demo.factura.events.FacturaEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CobroFacturaListener {

    @EventListener
    void cobrar(FacturaEvent event) {
        System.out.println("Cobrando factura " + event.getFacturaModel());
    }
}
