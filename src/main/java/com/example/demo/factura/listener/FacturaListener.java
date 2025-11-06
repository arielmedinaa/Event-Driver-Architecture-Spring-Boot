package com.example.demo.factura.listener;

import com.example.demo.factura.events.FacturaEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class FacturaListener {

    @EventListener
    @Async
    void on(FacturaEvent event) {
        System.out.println("Recibido evento: " + event.getFacturaModel());
    }
}
