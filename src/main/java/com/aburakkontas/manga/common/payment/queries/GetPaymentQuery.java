package com.aburakkontas.manga.common.payment.queries;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class GetPaymentQuery {
    private UUID userId;
    private String paymentId;
}
