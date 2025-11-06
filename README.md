🧾 Billing System – Event-Driven Architecture (EDA)
📘 Overview

This project is a modular billing system built with Spring Boot.
It follows an Event-Driven Architecture (EDA) and Domain-Oriented Modular Structure, designed for scalability, maintainability, and integration with modern technologies like Redis, Docker, and Ollama AI.

Each business domain — such as Invoices, Clients, Products, and Stock — is isolated within its own module, allowing independent development and loose coupling between components.

🏗️ Architecture
⚙️ 1. Event-Driven Architecture (EDA)

The system follows an asynchronous, event-driven communication model.
Whenever a key operation occurs (e.g., an invoice is created), the system publishes an internal Spring event, which is later consumed by one or more listeners.

This approach improves decoupling, scalability, and modularity, while enabling reactive workflows across modules.

Example:

When an invoice is saved:
```
FacturaGrabadaEvent event = new FacturaGrabadaEvent(this, factura);
applicationEventPublisher.publishEvent(event);
````

A separate listener handles the event asynchronously:

```
@Async
@EventListener
public void handleFacturaGrabada(FacturaGrabadaEvent event) {
    stockService.updateStock(event.getFactura());
}
```


➡️ The main service (invoice saving) doesn’t need to know who listens or reacts to the event — maintaining full isolation between modules.

🧩 2. Modular Structure by Domain

Each domain (module) contains all its relevant logic:

controller/ → REST controllers

service/ → business logic

repository/ → JPA repositories

model/ → entities

event/ → domain events

listener/ → event listeners

dto/ → data transfer objects
