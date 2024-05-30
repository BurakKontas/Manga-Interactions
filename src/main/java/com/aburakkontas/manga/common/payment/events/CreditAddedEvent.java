package com.aburakkontas.manga.common.payment.events;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
public class CreditAddedEvent {
    @TargetAggregateIdentifier
    private String userId;
    private Double credit;
    private String paymentId;
}
