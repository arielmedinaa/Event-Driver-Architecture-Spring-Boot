package com.example.demo.modules.cobros.service;

import com.example.demo.modules.cobros.events.CobrosEvents;
import com.example.demo.modules.cobros.model.CobrosModel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CobrosService {
    private final ApplicationEventPublisher publisher;

    public void cobrar(CobrosModel cobrosModel) {
        System.out.println("cobrando" + cobrosModel);
        publisher.publishEvent(new CobrosEvents(cobrosModel, this, "Test email", "arielmedin577@gmail.com"));
    }
}
