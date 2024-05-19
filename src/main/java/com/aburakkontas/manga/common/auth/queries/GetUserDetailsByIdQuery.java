package com.aburakkontas.manga.common.auth.queries;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class GetUserDetailsByIdQuery {
    private UUID userId;
}
