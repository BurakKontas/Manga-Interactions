package com.aburakkontas.manga.common.payment.queries;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class DeleteItemQuery {
    private UUID itemId;
}
