package com.aburakkontas.manga.common.payment.queries;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
public class GetPaymentsQuery {
    private ZonedDateTime from;
    private ZonedDateTime to;
    private String sort;
    private Integer page;
    private Integer size;
    private String order;
}
