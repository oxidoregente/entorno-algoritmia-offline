package com.algoritmia.nivel30.orquestacion;

/**
 * 🏆 SOLUCIONES: Patrones Transaccionales Distribuidos.
 */
public class OrquestacionExtraSoluciones {

    // Saga Pattern
    public void saga() {
        try {
            // Reservar
        } catch (Exception e) {
            // liberarStock() -> Compensación
        }
    }

    // Outbox Pattern
    /*
    @Transactional
    public void outbox() {
        repo.save(entity);
        outboxRepo.save(new OutboxEvent(entity.id, "ENTITY_CREATED"));
    }
    */
}
