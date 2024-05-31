package com.aburakkontas.manga.common.payment.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Data
@AllArgsConstructor
public class RefundCreditCommand {
    @TargetAggregateIdentifier
    private UUID userId;
    private Double credit;
}
