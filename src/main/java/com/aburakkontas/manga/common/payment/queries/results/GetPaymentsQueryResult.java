package com.aburakkontas.manga.common.payment.queries.results;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.ArrayList;

@Data
public class GetPaymentsQueryResult {
    private ArrayList<GetPaymentQueryResult> payments;
}
