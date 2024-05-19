package com.aburakkontas.manga.common.payment.queries;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Builder
public class GetPaymentsByUserQuery {
    private ZonedDateTime from;
    private ZonedDateTime to;
    private String sort;
    private Integer page;
    private Integer size;
    private String order;
    private UUID userId;
    private UUID executorId;
}
