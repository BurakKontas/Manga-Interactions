package com.aburakkontas.manga.common.payment.events;

import lombok.Data;

import java.util.UUID;

@Data
public class DeductCreditEvent {
    private UUID userId;
    private Double credit;
}
