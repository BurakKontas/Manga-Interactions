package com.aburakkontas.manga.common.payment.queries;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@Builder
public class UpdateItemQuery {
    private UUID itemId;
    private String name;
    private String description;
    private Double price;
    private String category;
    private UUID imageId;
    private String itemType;
}
