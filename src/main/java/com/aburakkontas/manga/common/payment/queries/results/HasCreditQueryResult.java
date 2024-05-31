package com.aburakkontas.manga.common.payment.queries.results;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HasCreditQueryResult {
    private boolean hasCredit;
    private Double credit;
}
