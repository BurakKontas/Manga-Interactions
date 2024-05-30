package com.aburakkontas.manga.common.payment.events;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
public class AddCreditEvent {
    @TargetAggregateIdentifier
    private String token;
    private String userId;
}
