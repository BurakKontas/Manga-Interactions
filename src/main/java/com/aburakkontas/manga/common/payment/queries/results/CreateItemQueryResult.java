package com.aburakkontas.manga.common.payment.queries.results;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateItemQueryResult {
    private boolean created;
    private UUID itemId;
}
