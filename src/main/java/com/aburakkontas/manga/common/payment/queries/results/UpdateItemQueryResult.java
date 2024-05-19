package com.aburakkontas.manga.common.payment.queries.results;

import lombok.Data;

import java.util.UUID;

@Data
public class UpdateItemQueryResult {
    private boolean updated;
    private UUID itemId;
}
