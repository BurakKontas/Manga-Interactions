package com.aburakkontas.manga.common.payment.queries.results;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class GetUserCreditQueryResult {
    private Double credit;
    private ArrayList<?> successfulTransactions;
    private ArrayList<?> failedTransactions;
}
