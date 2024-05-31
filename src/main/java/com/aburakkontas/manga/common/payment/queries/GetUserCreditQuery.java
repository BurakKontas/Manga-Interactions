package com.aburakkontas.manga.common.payment.queries;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class GetUserCreditQuery {
    private UUID userId;
}
