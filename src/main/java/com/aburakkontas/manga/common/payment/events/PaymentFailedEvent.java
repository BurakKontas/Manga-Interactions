package com.aburakkontas.manga.common.payment.events;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
public class PaymentFailedEvent {
    @TargetAggregateIdentifier
    private String paymentId;
    private String userId;
}
