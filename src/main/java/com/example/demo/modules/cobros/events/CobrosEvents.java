package com.example.demo.modules.cobros.events;

import com.example.demo.modules.cobros.model.CobrosModel;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class CobrosEvents extends ApplicationEvent {
    private final CobrosModel cobros;
    private String message = "Bienvenidos a la empresa de cobros";
    private String to = "arielmedin577@gmail.com";

    public CobrosEvents(CobrosModel cobrosModel, Object source, String message, String to) {
        super(source);
        this.cobros = cobrosModel;
        this.message = message;
        this.to = to;
    }

    public String getText() { return message; }
}
