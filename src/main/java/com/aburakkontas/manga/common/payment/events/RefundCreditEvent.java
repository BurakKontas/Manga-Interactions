package com.aburakkontas.manga.common.payment.events;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
public class RefundCreditEvent {
    private UUID userId;
    private Double credit;
}
