package com.aburakkontas.manga.common.payment.commands;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@RequiredArgsConstructor
public class PaymentReceivedCommand {
    @TargetAggregateIdentifier
    private String token;
    private String paymentId;
    private String userId;
    private String status;
}
