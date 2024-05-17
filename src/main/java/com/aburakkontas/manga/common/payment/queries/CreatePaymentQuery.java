package com.aburakkontas.manga.common.payment.queries;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.UUID;

@Data
@Builder
public class CreatePaymentQuery {
    private UUID userId;
    private String email;
    private String firstName;
    private String lastName;
    private ArrayList<UUID> itemIds;
    private String callbackUrl;
    private String currency;
}
