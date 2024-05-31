package com.aburakkontas.manga.common.payment.queries.results;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPaymentQueryResult {
    private UUID userId;
    private String paymentId;
    private Double price;
    private ZonedDateTime paymentDate;
    private String cardType;
    private String cardLastFourDigits;
    private String cardFamily;
    private String cardAssociation;
    private ArrayList<UUID> itemIds;
}
