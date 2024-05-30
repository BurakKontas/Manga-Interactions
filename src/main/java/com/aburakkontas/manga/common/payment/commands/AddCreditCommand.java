package com.aburakkontas.manga.common.payment.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class AddCreditCommand {

    @TargetAggregateIdentifier
    private String paymentId;
    private String userId;
    private String token;
}
