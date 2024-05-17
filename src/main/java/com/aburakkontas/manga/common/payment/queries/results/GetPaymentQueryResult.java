package com.aburakkontas.manga.common.payment.queries.results;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.UUID;

@Data
public class GetPaymentQueryResult {
    private UUID userId;
    private String paymentId;
    private Double price;
    private Double paidPrice;
    private ZonedDateTime paymentDate;
    private String cardType;
    private String cardLastFourDigits;
    private String cardFamily;
    private String cardAssociation;
    private ArrayList<UUID> itemIds;
}
