package com.aburakkontas.manga.common.payment.queries.results;

import lombok.Data;

import java.util.UUID;

@Data
public class DeleteItemQueryResult {
    private boolean deleted;
    private UUID itemId;
}
