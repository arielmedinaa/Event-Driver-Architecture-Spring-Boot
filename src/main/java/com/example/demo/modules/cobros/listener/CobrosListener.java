package com.example.demo.modules.cobros.listener;

import com.example.demo.modules.cobros.service.CobrosService;
import com.example.demo.modules.factura.events.FacturaEvent;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CobrosListener {
    private final CobrosService cobrosService;

    @EventListener
    @Async("asyncExecutor")
    void cobro(FacturaEvent event) throws MessagingException {
        cobrosService.cobrar(event.getFacturaModel().cobros());
    }
}
