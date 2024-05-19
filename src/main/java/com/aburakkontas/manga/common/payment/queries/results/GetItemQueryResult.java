package com.aburakkontas.manga.common.payment.queries.results;

import com.aburakkontas.manga.common.payment.queries.CreateItemQuery;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
public class GetItemQueryResult {
    private UUID itemId;
    private String name;
    private String description;
    private Double price;
    private String category;
    private UUID imageId;
    private String itemType;
}
